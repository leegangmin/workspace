package com.gangminlee.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gangminlee.dao.BoardDAO;

@WebServlet("/index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Index() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB호출 -> DAO -> DTO(MAP)
		//			ArrayList<HashMap<String, Object>>
		BoardDAO dao = new BoardDAO();
		//RD
		RequestDispatcher rd = request.getRequestDispatcher("./index.jsp");
		request.setAttribute("dto", dao.boardList());
		rd.forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
