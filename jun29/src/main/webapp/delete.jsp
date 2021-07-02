<%@page import="com.gangminlee.dao.BoardDAO"%>
<%@page import="com.gangminlee.util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int bno = Util.str2Int(request.getParameter("bno"));
BoardDAO dao = new BoardDAO();
int count = dao.delete(bno);
//response.sendRedirect("./board.jsp");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
	<h1>삭제</h1>
	<%
	if (count == 1) {
	%>
	<h2>삭제하였음.</h2>
	<%
	} else if (count == 0) {
	%>
	<h2>문제가 발생하였음.</h2>
	<%
	}
	%>
	<button onclick="location.href='./board.jsp'">게시판으로 이동</button>

</body>
</html>