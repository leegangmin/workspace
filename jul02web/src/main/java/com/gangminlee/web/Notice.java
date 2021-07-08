package com.gangminlee.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gangminlee.dao.BoardDAO;
import com.gangminlee.dto.BoardDTO;


@WebServlet("/notice")
public class Notice extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //DAO 연결
	BoardDAO dao = new BoardDAO();
  
    public Notice() {
        super();
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		//System.out.println("들어옴.");
		//DAO에서 값 불러오기
		//ArrayList<BoardDTO> notice = dao.list();
		RequestDispatcher rd = request.getRequestDispatcher("./notice.jsp");
		//request.setAttribute("notice", notice);
		request.setAttribute("notice", dao.list());
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
