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

@WebServlet("/deleteComment")
public class DeleteComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteComment() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(request.getParameter("cno") != null
    			&& request.getParameter("bno") != null
    			&& Util.str2Int2(request.getParameter("cno")) != 0
    			&& Util.str2Int2(request.getParameter("bno")) != 0
    			&& session.getAttribute("id") != null
    			&& session.getAttribute("name") != null
    			) {
    		int cno = Util.str2Int(request.getParameter("cno"));
    		int bno = Util.str2Int(request.getParameter("bno"));
    		CommentDTO dto = new CommentDTO();
    		dto.setBno(bno);
    		dto.setCno(cno);
    		dto.setId((String) session.getAttribute("id"));
    		CommentDAO dao = new CommentDAO();
    		int result = dao.deleteComment(dto);
    		if(result == 1) {
    			response.sendRedirect("./detail.jsp?bno="+bno);
    		}else {
    			response.sendRedirect("./error.jsp");
    		}
		} else {
			response.sendRedirect("./error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
