<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<div id="container">
<div id="menu">
	<c:import url="./menu.jsp"/>
</div>
<div id="main">
	<h1>boardList</h1>
	<div id="mainWrapper">
	<ul id="ulTable">
		<li>
			<ul>
				<li>번호</li>
				<li>제목</li>
				<li>글쓴이</li>
				<li>날짜</li>
				<li>조회수</li>
			</ul>
		</li>
		<c:forEach items="${dto }" var="dto">
		<li>
			<ul>
				<li>${dto.fno }</li>
				<li>${dto.ftitle }</li>
				<li>${dto.name }</li>
				<li>${dto.fdate }</li>
				<li>${dto.fcount }</li>
			</ul>
		</li>
		</c:forEach>
	</ul>
	</div>
</div>
</div>
	
	
	
	
	
	
	
	
	
</body>
</html>