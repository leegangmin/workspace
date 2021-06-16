<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
자바호출
<!-- 여긴 자바 아님 -->
<%
//여긴 자바
String hi = "hello";
%>

자바로 만들어진 변수 hi를 출력하기 : <%=hi %>

<hr>

<%
	for(int i=0; i<10; i++){
	//반복문	
%>

<!-- html -->
	값 : <%=i %> <br>
<%

	}
%>


</body>
</html>