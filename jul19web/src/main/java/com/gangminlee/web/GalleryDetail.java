package com.gangminlee.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gangminlee.dao.BoardDAO;
import com.gangminlee.dao.GalleryDAO;
import com.gangminlee.util.Util;

@WebServlet("/galleryDetail")
public class GalleryDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GalleryDetail() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println(request.getParameter("gno"));
		//값 찍히면 if문으로 값이 있을때와 없을때를 구분해주세요.
		//gno가 오는지, 숫자인지 검사
		if(request.getParameter("gno") != null 
				&& Util.str2Int2(request.getParameter("gno")) != 0
				){
			//올바른 숫자
			//데이터베이스에 질의 DAO
			int gno = Util.str2Int(request.getParameter("gno"));
			//BoardDAO dao = new BoardDAO();//싱글턴으로 바꿔주세요
			GalleryDAO dao = GalleryDAO.getInstance();//싱글턴입니다.
			HashMap<String, Object> dto = dao.detail(gno);
			
			//혹시 댓글이 0보다 크다면 댓글도 불러와야 합니다.
			//댓글이 0보다 큰지 작은지 어떻게 알까요? 
			//System.out.println(dto.get("commentcount"));
			//System.out.println(((int)dto.get("commentcount")) > 0);
			/* 댓글 기능
			  if(((int)dto.get("commentcount")) > 0) {
				//System.out.println(dto.get("commentcount"));
				//있는지 확인 되었으면 서버에 질의하기 DAO
				ArrayList<HashMap<String, Object>> commentList 
							= dao.commentList(gno);
				//디스패쳐가 가져갈 수 있도록 붙이기
				request.setAttribute("commentList", commentList);
				//System.out.print(commentList);
			}
			*/
			//RD 붙여넣기 dto 여기에 담아주세요.
			RequestDispatcher rd = request.getRequestDispatcher("./galleryDetail.jsp");
			request.setAttribute("dto", dto);//이름, 값
			//페이지 이동 ./detail.jsp
			rd.forward(request, response);			
		} else {
			response.sendRedirect("./gallery");//다시 리스트로 이동
			//우리는 이제 페이지 이동은 서블릿 = controller
			//						DB		   = model
			//						화면 jsp   = view
			//model1 model2 mvc
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
