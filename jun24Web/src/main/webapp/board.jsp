<%@page import="com.gangminlee.dto.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.gangminlee.dao.BoardDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.gangminlee.web.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Board</title>
<style type="text/css">
table {
	width: 800px;
	height: 400px;
	background-color: #e1d1d1;
	border-collapse: collapse;
	font-weight: bold;
}

table td {
	border-bottom: 1px blue solid;
	text-align: center;
}

table th {
	background-color: white;
}

table tr:hover {
	background-color: white;
}

#title {
	width: 400px;
	text-align: left;
}

a:visited {
	text-decoration: none;
	color: black;
}

a:link { /* 방문전 */
	text-decoration: none;
	color: red;
}

a:active { /* 클릭했을 때 */
	text-decoration: none;
	color: white;
}
</style>
</head>
<body>
	<h1>board</h1>
	<%
	//DAO가 디비와 작업 후 결과를 돌려주면 그걸 받아서 출력.
	//DAO / DTO
	BoardDAO dao = new BoardDAO();
	ArrayList<BoardDTO> list = dao.list();
	%>
	<table>
		<thead>
			<tr>
				<th>No</th>
				<th>Title</th>
				<th>Author</th>
				<th>Date</th>
				<th>Count</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < list.size(); i++) {
			%>
			<tr>
				<td><%=list.get(i).getBno()%></td>
				<td id="title"><a
					href="index.jsp?bno=<%=list.get(i).getBno()%>"> <%=list.get(i).getBtitle()%>
				</a></td>

				<td><%=list.get(i).getName()%></td>

				<td><%=list.get(i).getBdate()%></td>
				<td><%=list.get(i).getBcount()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
</body>
</html>