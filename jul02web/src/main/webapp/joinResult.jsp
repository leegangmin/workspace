<%@page import="com.gangminlee.util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입 결과</title>

</head>
<body>
<%@ include file="./menu.jsp"%>
	<h1>가입 결과</h1>


<%
if(request.getAttribute("count").equals(1)) {
%>
	<h2><%=request.getAttribute("id")%>님 가입 완료.</h2>
	<h3>로그인 ㄱ</h3>
	<button onclick="location.href='./index.jsp'"> 로그인 </button>
<%
} else {
%>
	<h2>문제가 발생함.</h2>
	<h3>가입 안됨. 다시 시도.</h3>
<%
}
%>
</body>
</html>