<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%!  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정하기</title>
</head>
<body>
	<h1>댓글 수정하기</h1>
	<hr>
	cno = ${dto1.cno }<br> 
	bno = ${dto1.bno }<br> 
	id = ${dto1.id }글쓴 사람과 지금 수정하는 사람이 같은지 검사용<br> 
	<div>
		<form action="">
			<textarea>${dto1.ccontent }</textarea>
			<input type="hidden" name="cno" value="${dto1.cno }">
			<input type="hidden" name="bno" value="${dto1.bno }">
			<button>수정하기</button>
		</form>
	</div>
	수정하기를 누르면 ModifyComment 서블릿 post로 보내기
</body>
</html>