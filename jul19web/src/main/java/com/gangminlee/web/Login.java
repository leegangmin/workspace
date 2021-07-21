package com.gangminlee.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gangminlee.dao.LoginDAO;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendRedirect("./login.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("./login.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		//if 검사를 넣어주세요
		System.out.println(id + " : " + pw);
		
		LoginDAO dao = new LoginDAO();
		//개인정보를 map에 담아오는 메소드
		HashMap<String, Object> member = dao.login(id, pw);
		System.out.println(member);
		//아이디 비번이 일치한다면
		if(member != null) {
			//세션만들기
			HttpSession session = request.getSession();
			session.setAttribute("id", member.get(id));
			session.setAttribute("pw", member.get(pw));
			
			response.sendRedirect("./board.jsp");
		} else {
			//아이디나 비번이 틀리다면
			response.sendRedirect("./index.jsp?error=3456");
		}
		
	}
	

}
