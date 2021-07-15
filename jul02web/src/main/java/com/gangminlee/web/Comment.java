package com.gangminlee.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gangminlee.dao.CommentDAO;
import com.gangminlee.dto.CommentDTO;
import com.gangminlee.util.Util;

@WebServlet("/comment")
public class Comment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		if (request.getParameter("comment") != null && request.getParameter("bno") != null
				&& session.getAttribute("id") != null) {

			// System.out.println(request.getParameter("comment"));
			// System.out.println(request.getParameter("bno"));
			String comment = request.getParameter("comment");
			int bno = Util.str2Int2(request.getParameter("bno"));
			String cip = Util.getIP(request);

			CommentDTO dto = new CommentDTO();
			dto.setBno(bno);
			dto.setCcontent(comment);
			dto.setId((String) session.getAttribute("id"));
			dto.setCip(cip);
			
			// DAO에게 줌
			CommentDAO dao = new CommentDAO();
			dao.commentInsert(dto);
			
			// 원래 게시글로 이동
			response.sendRedirect("./detail.jsp?bno=" + bno);
		} else {
			response.sendRedirect("./error.jsp");
		}

	}

}
