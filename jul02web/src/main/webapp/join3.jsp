<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>가입하기</title>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
}

table {
	margin: 0 auto;
	height: 200px;
	width: 300px;
	border-collapse: collapse;
	border: 1px gray solid;
}

table input {
	width:150px;
	height:30px;
	
}
</style>
</head>
<body>
	<h1>가입하기</h1>
	<table>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" id="id"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" id="name"></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><input type="password" name="pw1" id="pw1"><br>
				<input type="password" name="pw2" id="pw2"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="email" name="email" id="email"></td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="reset">지우기</button>

				<button type="submit">가입하기</button>
			</td>
		</tr>

	</table>
</body>
</html>