<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Error</title>
</head>
<body>
	<h1>error</h1>
	<hr>
<% //자바
//para~ error로 오는 것을 잡아서 사용함.
//e3380

String error = request.getParameter("error");
if (error.equals("e3380")) {
	//html코드로 변환
%>
	<h2>이미 등록된 ID</h2>
	<h3>다른 ID로 가입해</h3>
	<h3><a href="./join.jsp">가입하기.</a></h3>
<%
} else if (error.equals("e4080")) {
	
} else {
	
}
%>

</body>
</html>