package com.gangminlee.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gangminlee.dao.CommentDAO;
import com.gangminlee.dto.CommentDTO;
import com.gangminlee.util.Util;

@WebServlet("/likeUp")
public class LikeUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LikeUp() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	if(request.getParameter("cno") != null
    			&& request.getParameter("bno") != null
    			&& Util.str2Int2(request.getParameter("cno")) != 0
    			&& Util.str2Int2(request.getParameter("bno")) != 0
    			) {
    		int cno = Util.str2Int(request.getParameter("cno"));
    		int bno = Util.str2Int(request.getParameter("bno"));
    		
    		CommentDTO dto = new CommentDTO();
    		dto.setCno(cno);
    		dto.setBno(bno);
    		
    		CommentDAO dao = new CommentDAO();
    		int count = dao.likeUp(dto);
    		if(count == 1) {
    			response.sendRedirect("./detail.jsp?bno="+bno);
    		} else {
    			response.sendRedirect("./error.jsp");
    		}
    	} else {
    		response.sendRedirect("./error.jsp");
    	}
    	
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
