<%@page import="com.gangminlee.dto.BoardDTO"%>
<%@page import="com.gangminlee.dao.BoardDAO"%>
<%@page import="com.gangminlee.util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글상세보기</title>
<style type="text/css">
#detail {
	margin: 0 auto;
	width: 400px;
	height: 500px;
	background-color: silver;
}

#title {
	width: 100%;
	height: 40px;
	padding: 10px;
	text-align: center;
	/* background-color: skyblue; */
	border-bottom: 2px solid black;
	box-sizing: border-box;
}

#date {
	width: 100%;
	height: 50px;
	/* background-color:green; */
	border-bottom: 1px solid gray;
}

#date2 {
	width: 160px;
	height: 30px;
	text-align: center;
	/* background-color: olive; */
	float: left;
	margin: 5px;
	padding: 5px;
}

#content {
	height: calc(100% - 91px);
	width: 100%;
	/* background-color: lime; */
	padding: 20px;
	box-sizing: border-box;
}
</style>
</head>
<body>
	<h1>detail</h1>
	1. 번호 받기 =
	<%
	//int bno = Integer.parseInt(request.getParameter("bno")); 
	int bno = Util.str2Int2(request.getParameter("bno"));

	//데이터베이스로 보내서 글 한 레코드 가져오기.

	//찍어보기
	BoardDAO dao = new BoardDAO();
	BoardDTO dto = dao.detail(bno);
	%>
	<hr>

	<div id="detail">
		<div id="title"><%=dto.getBtitle()%>
			<a href="./delete.jsp?bno=<%=dto.getBno() %>"><!-- 액션과 같음 -->
			<img alt="delete"
				src="./delete.png"
				style="vertical-align: middle; max-width: 20px; height: auto;">
			</a><!-- onclick으로 대체가능 -->
		</div>
		<div id="date">
			<div id="date2"><%=dto.getName()%><br>(<%=dto.getId()%>)
			</div>
			<div id="date2"><%=dto.getBcount()%><br><%=dto.getBdate()%></div>
		</div>
		<div id="content"><%=dto.getBcontent()%></div>
	</div>










</body>
</html>