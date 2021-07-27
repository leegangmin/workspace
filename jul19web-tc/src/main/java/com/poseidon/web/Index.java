package com.poseidon.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.poseidon.dao.BoardDAO;
import com.poseidon.dao.LogDAO;
import com.poseidon.util.Util;

@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Index() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB호출 -> DAO -> DTO(MAP)
		//			ArrayList<HashMap<String, Object>>
		//BoardDAO dao = new BoardDAO();이 호출방법을 변경하겠습니다.
		//싱글턴으로 만들어진 객체 호출해옵니다.
		BoardDAO dao = BoardDAO.getInstance();
		
		//log남기기
		HashMap<String, Object> log = new HashMap<String, Object>();
		log.put("ip", Util.getIP(request));
		log.put("id", "");
		log.put("target", "index");
		log.put("etc", request.getHeader("User-Agent"));
		LogDAO.insertLog(log);
				
		//RD
		RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
		request.setAttribute("dto", dao.boardList());
		//request.setAttribute("dto", BoardDAO.getInstance().boardList());
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
