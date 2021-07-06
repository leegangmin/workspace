<%@page import="com.gangminlee.dto.BoardDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.gangminlee.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

h1 {
	align: center;
}
</style>
<script type="text/javascript">
function update(bno){
	//alert("수정");
	if(confirm("수정?")) {
		location.href="update?bno="+bno;
	}
}
function del(bno){
	//alert("삭제" + bno);
	if(confirm("삭제?")) {
		alert("삭제함.");
		location.href="delete?bno="+bno;
	}
}

</script>

</head>
<body>
	<%@ include file="./menu.jsp"%>
	<h1>detail</h1>
	<%
	int bno = Integer.parseInt(request.getParameter("bno"));
	BoardDAO dao = new BoardDAO();
	BoardDTO dto = dao.detail(bno);
	%>
	<table style="margin: 0 auto; width: 300px;" border="1">
		<tr>
			<td><%=dto.getBtitle()%> 
			<%if(((String)session.getAttribute("id")).equals(dto.getId())) { %>
			
				<img alt="delete" src="./delete.png" onclick="return del(<%=dto.getBno()%>)" title="이 글을 삭제합니다.">
				<img alt="modify" src="./modify.png"
				onclick="return update(<%=dto.getBno()%>)" title="이 글을 수정합니다.">
			<%} %>
			</td>
		</tr>
		<tr>
			<td><%=dto.getName()%></td>
		</tr>
		<tr>
			<td><%=dto.getBcount()%></td>
		</tr>
		<tr>
			<td><%=dto.getBcontent()%></td>
		</tr>
	</table>
</body>
</html>