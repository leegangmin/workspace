<%@page import="com.gangminlee.dao.LoginDAO"%>
<%@page import="com.gangminlee.dto.LoginDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	//�ڹ�
	LoginDTO dto = new LoginDTO();
	dto.setId(request.getParameter("id"));
	dto.setName(request.getParameter("name"));
	dto.setPw(request.getParameter("pw1"));
	//pw1�� pw2�� ���ٰ� �����ϰ� �Ѿ.
	dto.setEmail(request.getParameter("email"));
	
	//loginDAO�� join(dto) �����
	//Conn pstmt rs ���� ����
	
	//���⼭ ��ü ���� / ���� / �׽�Ʈ
	LoginDAO dao = new LoginDAO();
	int count = dao.join(dto);
	if (count == 1) {
		//System.out.print(count+"���� ó��");
		response.sendRedirect("./login.jsp?result=success");
	}else{
		//System.out.print(count+"������ ó��");
		response.sendRedirect("./error.jsp?error=e3380");
		
	}
	//html �� ������
	//action�� �ڹ��ڵ� ó����.
	
	/* action�̶�� �Ǿ��ִ� jsp��
	�������� �ڹ��ڵ常 �������. = servlet
	*/
%>