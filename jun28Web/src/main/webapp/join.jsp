<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>join</title>
</head>
<body>
	<h1>join</h1>
	<form action="./joinAction.jsp" method="post">
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>암호</td>
			<td>
				<input type="password" name="pw1"><br>
				<input type="password" name="pw2">
			</td>
		</tr>
		<tr>
			<td>email</td>
			<td><input type="email" name="email"></td>
		</tr>
	</table>
	<button type="reset">리셋</button>
	<button type="submit">가입하기</button>
	</form>
	
	
</body>
</html>