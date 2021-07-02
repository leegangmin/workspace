<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
}

#write {
	height: 500px;
	width: 500px;
	background-color: gray;
	margin: 0 auto;
	padding: 10px;
	"
}

#title {
	width: 100%;
	height: 30px;
	margin-bottom: 10px;
}

#content {
	width: 100%;
	height: 400px;
	margin-botton: : 10px;
}

#sub {
	width: 100%;
	height: 35px;
	background-color: #82E0AA;
	color: black;
	font-size: large;
	border: 1px solid #82E0AA;
}
</style>
</head>
<body>
	<h1>글쓰기</h1>

	<hr>

	<div id="write">
		<form action="./writeAction.jsp" method="post">
			<input type="text" name="title" id="title">
			<textarea name="content" id="content"></textarea>
			<button id="sub" type="submit">글쓰기</button>
		</form>
	</div>
</body>
</html>