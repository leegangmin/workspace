<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
<style type="text/css">
#loginbox{
	margin:0 auto;
	/* 여기를 100px; auto 0px;라고 주시면
	위는 100, 양 옆은 auto, 아래는 0이 됩니다.
	 */
	width: 280px;
	min-height: 300px;
	background-color: #c0c0c0;
	text-align: center;
	padding: 10px;
}
#loginbox input{
	width: 280px;
	height: 30px;
	margin-bottom: 5px;
	font-size: 16pt;
	color: green;
	font-weight: bold;
	font-family: 궁서체;
	text-align: center;	
}
#loginbox input[type="password"]{
	font-size: small;
	color: black;
}

#loginbox button {
	width: 280px;
	height: 40px;
	margin-bottom: 5px;
	font-size: 16pt;
	color: green;
	font-weight: bold;
}
</style>
</head>
<body>
	<h1>login</h1>
	
	<div id="loginbox">
		<img alt="" src="./login.png">
		<form action="./loginAction.jsp" method="post">
			<input type="text" name="id" maxlength="15" placeholder="아이디를 입력하세요">
			<input type="password" name="pw" maxlength="20" placeholder="비밀번호를 입력하세요"><br>
			<button type="reset">RESET</button><br>
			<button type="submit">LOGIN</button>
		</form>
	</div>
	
<%
String result = request.getParameter("result");
if(result.equals("success")){
%>
	<script type="text/javascript">
		alert("가입됨.\n ㅊㅋ");
	</script>


<%
}
%>
	
	
</body>
</html>