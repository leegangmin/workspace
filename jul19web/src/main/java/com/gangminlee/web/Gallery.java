package com.gangminlee.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gangminlee.dao.GalleryDAO;

@WebServlet("/gallery")
public class Gallery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Gallery() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//데이터 불러오기 galleryview에서 모든 데이터 가져오기
		//GalleryDAO dao =  GalleryDAO.getInstance();
		//ArrayList<HashMap<String, Object>> list = dao.galleryList();
		//ArrayList<HashMap<String, Object>> list2  = GalleryDAO.getInstance().galleryList(); 
		
		//페이지 넘기기
		RequestDispatcher rd 
				= request.getRequestDispatcher("gallery.jsp");
		//request.setAttribute("list", list2);
		request.setAttribute("list", GalleryDAO.getInstance().galleryList());
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
