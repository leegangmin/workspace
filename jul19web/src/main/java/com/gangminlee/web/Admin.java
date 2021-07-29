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
import javax.servlet.http.HttpSession;

import com.gangminlee.dao.LogDAO;
import com.gangminlee.util.Util;

@WebServlet("/admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LogDAO dao = LogDAO.getInstance();

	public Admin() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// session 검사 후 grade가 있으면 아래 실행
		HttpSession session = request.getSession();
		//System.out.println(session.getAttribute("grade"));
		if (session.getAttribute("grade") == null ||
				(int)session.getAttribute("grade") != 9) {
			response.sendRedirect("./index");
		} else {

			// 없으면 접근 불가 출력
			// log 내용 가져오기
			// 페이징 처리
			int page = 1;
			ArrayList<HashMap<String, Object>> list = null;
			if (request.getParameter("page") != null) {
				page = Util.str2Int(request.getParameter("page"));
			}
			if(request.getParameter("ip") == null && request.getParameter("target") == null) {
				list = dao.logList((page - 1) * 20);
			} else if (request.getParameter("target") == "") {
				
			} else if (request.getParameter("ip") == "") {
				String ip = request.getParameter("ip");
				list = dao.selectIP(ip, (page - 1) * 10);
			}

			list = dao.logList((page - 1) * 20);
			//ipList    SELECT DISTINCT log_ip FROM logview
			ArrayList<String> ipList = dao.list("log_ip");
			
			//targetList   SELECT DISTINCT log_target FROM logview
			ArrayList<String> targetList = dao.list("log_target");
			// admin.jsp 디스패쳐로 연결
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			// 가져갈 값
			request.setAttribute("list", list);
			request.setAttribute("ipList", ipList);
			request.setAttribute("targetList", targetList);
			request.setAttribute("ip", request.getParameter("ip"));
			request.setAttribute("target", request.getParameter("target"));

			// 2.totalCount
			if (list != null && list.size() > 0) {
				request.setAttribute("totalCount", list.get(0).get("totalcount"));
			}
			// 3.page
			request.setAttribute("page", page);
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
