package com.gangminlee.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gangminlee.dao.CommentDAO;
import com.gangminlee.dto.CommentDTO;
import com.gangminlee.util.Util;

@WebServlet("/modifyComment")
public class ModifyComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModifyComment() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//검증 1.세션, 2 cno, 3 bno
		HttpSession session = request.getSession();
		if(Util.str2Int2(request.getParameter("cno")) != 0 
				|| Util.str2Int2(request.getParameter("bno")) != 0 
				|| session.getAttribute("id") != null 
				|| session.getAttribute("name") != null
				) {
			//있다면
			//dto생성 변수 만들기
			int cno = Util.str2Int(request.getParameter("cno"));
			int bno = Util.str2Int(request.getParameter("bno"));
			String id = (String) session.getAttribute("id");
			CommentDTO sendDTO = new CommentDTO();
			sendDTO.setCno(cno);
			sendDTO.setBno(bno);
			sendDTO.setId(id);
			
			//dao작업
			CommentDAO dao = new CommentDAO();
			//데이터 받기
			CommentDTO resultDTO = dao.modifyComment(sendDTO);
			//페이지 이동
			if(request != null) {
				//되돌아 온 값이 있다면 정상 수정페이지로
				RequestDispatcher rd 
					= request.getRequestDispatcher("./modifyComment.jsp");
				request.setAttribute("dto1", resultDTO);
				rd.forward(request, response);
			}else {
				//되돌아 온 값이 없다면 비정상
				response.sendRedirect("./error.jsp?code=error5");
			}
		} else {
			//없다면 에러로 이동
			response.sendRedirect("./error.jsp?code=error7");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
