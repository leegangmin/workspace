<%@page import="com.gangminlee.dto.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.gangminlee.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보드</title>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
}
table {
	margin: 0 auto;
	height: 400px;
	width: 500px;
	background-color: #c0c0c0;
	border-collapse: collapse;
	text-align: center;
	
}
th{	border-bottom: 3px solid white;}
td{	border-bottom: 1px solid white;}
#title{
	text-align: left;
	width: 250px;
}
tr:hover {
	transition: 2s;
	transition-deley:0.5s;
	background-color: green;}
</style>
</head>
<body>
	<h1>board</h1>
<%
	BoardDAO dao = new BoardDAO();
	ArrayList<BoardDTO> list = dao.list();
%>	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
<% for(int i = 0; i < list.size(); i++){ %>
		<tr onclick="location.href='./detail.jsp?bno=<%=list.get(i).getBno() %>'">
			<td><%=list.get(i).getBno() %></td>		
			<td id="title"><%=list.get(i).getBtitle() %></td>		
			<td><%=list.get(i).getName() %></td>		
			<td><%=list.get(i).getBdate() %></td>		
			<td><%=list.get(i).getBcount() %></td>				
		</tr>
<%} %>
	</table>

	<button onclick="location.href='./write.jsp'">글쓰기</button>











</body>
</html>