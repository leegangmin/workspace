<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${dto eq null }">
	<c:redirect url="./index"/>
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<style type="text/css">
small{
	height: auto;
	width: auto;
	background-color: red;
	color: white;
	border-radius: 25%;
}
</style>
</head>
<body>
<div id="container">
<div id="menu">
	<c:import url="menu.jsp"/>
</div>
<div id="main">
	<h1>boardList</h1>
	<div id="mainWrapper">
	<ul id="ulTable">
		<li>
			<ul>
				<li>No</li>
				<li>Title</li>
				<li>Writer</li>
				<li>Date</li>
				<li>Count</li>
			</ul>
		</li>
		<c:forEach items="${dto }" var="dto">
		<li>
			<ul>
				<li>${dto.fno }</li>
				<li>
				
				<a href="./detail?fno=${dto.fno }">${dto.ftitle }
				<c:if test="${dto.commentcount > 0}"><small>${dto.commentcount }</small></c:if>
				</a>
				
				</li>
				<li>${dto.name }</li>
				<li>${dto.fdate }</li>
				<li>${dto.fcount }</li>
			</ul>
		</li>
		</c:forEach>
	</ul>
	<a href="./freeWrite">글쓰기</a>
	</div>
</div>
</div>
	
	
	
	
	
	
	
	
	
</body>
</html>