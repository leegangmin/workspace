<%@page import="com.gangminlee.dao.LoginDAO"%>
<%@page import="com.gangminlee.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	//자바
	LoginDTO dto = new LoginDTO();
	dto.setId(request.getParameter("id"));
	dto.setName(request.getParameter("name"));
	dto.setPw(request.getParameter("pw1"));
	//pw1과 pw2가 같다고 생각하고 넘어감.
	dto.setEmail(request.getParameter("email"));
	
	//loginDAO에 join(dto) 만들기
	//Conn pstmt rs 쿼리 생성
	
	//여기서 객체 생성 / 실행 / 테스트
	LoginDAO dao = new LoginDAO();
	int count = dao.join(dto);
	if (count == 1) {
		//System.out.print(count+"정상 처리");
		response.sendRedirect("./login.jsp?result=success");
	}else{
		//System.out.print(count+"비정상 처리");
		response.sendRedirect("./error.jsp?error=e3380");
		
	}
	//html 다 삭제함
	//action은 자바코드 처리함.
	
	/* action이라고 되어있는 jsp는
	이제부터 자바코드만 남기겠음. = servlet
	*/
%>