package com.gangminlee.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gangminlee.dao.BoardDAO;

@WebServlet("/commentModify")
public class CommentModify extends HttpServlet {
	private static final long serialVersionUID = 1L;
     public CommentModify() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		
		System.out.println(request.getParameter("content"));
		System.out.println(request.getParameter("fno"));
		System.out.println(request.getParameter("fcno"));
		
		HashMap<String, Object> dto = new HashMap<String, Object>();
		dto.put("content", request.getParameter("content"));
		dto.put("fno", request.getParameter("fno"));
		dto.put("fcno", request.getParameter("fcno"));
		
		//DAO
		BoardDAO dao = new BoardDAO();
		int result = dao.commentModify(dto);
		
		//페이지 이동
		if (result == 1) {
			response.sendRedirect("./detail?fno="+request.getParameter("fno"));
		} else {
			response.sendRedirect("./error?code=1234&fno="+request.getParameter("fno"));
			
		}
	}

}
