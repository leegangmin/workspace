<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<style>
body{
background-image:url("./appleBack.jpg");
background-position: center;
background-repeat: no repeat;
background-size: auto;
}
#loginbox {
	margin: 0 auto;
	margin-top:100px;
	width: 400px;
	height: 180px;
	border: 5px solid gray;
	border-radius: 5px;
	}

#loginimg {
	height: 200px;
	width: 200px;
	float: left;
	padding:10px;
	box-sizing: border-box;
}

#loginimg img {
	height: 160px;
}

#logininput {
	height: 200px;
	width: 200px;
	padding: 10px;
	float: left;
	margin-top: 30px;
	text-align: center;
	box-sizing: border-box;
}

#logininput input, button {
	margin: 0;
	padding: 0;
	width: 90%;
	height: 30px;
	margin-bottom: 5px;
}
</style>
</head>
<body>
	<%@ include file="./menu.jsp"%>

	<div id="loginbox">
		<div id="loginimg">
			<img alt="login" src="./login.png">
		</div>
		<div id="logininput">
			<input type="text" id="id" name="id" placeholder="ID"> <input
				type="password" id="pw" name="pw" placeholder="PW">
			<button type="submit">LOGIN</button>

		</div>
	</div>
</body>
</html>