<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<style type="text/css">
* {
	padding: 0;
	margin: 0;
}

h2 {
	text-align: center;
	font-size: 30px;
	padding: 30px 0;
	letter-spacing: 10px;
}

#join_page {
	width: 450px;
	height: 550px;
	background-color: rgba(20, 20, 10, 50);
	margin: 20px auto 0;
	padding-top: 20px;
	border-radius: 10px;
}

#jactionp {
	width: 100%;
	padding-bottom: 25px;
}

#jactionp p {
	width: 450px;
	padding-bottom: 20px;
}

.jtitle {
	display: block;
	width: 430px;
	height: 30px;
	padding: 0 10px;
	color: #BCE6D7;
}

#jactionp p input {
	width: 400px;
	height: 35px;
	lineheight: 35px;
	margin: 0 10px;
	padding: 0 15px;
	border: 1px solid #82E0AA;
	border-radius: 10px;
	box-shadow: none;
	<!--margin-bottom: 10px;-->
}

#join_pw .jpw1 {
	margin-bottom: 10px;

} #join_pw .jpw2 {

}

#jsubb {
	width: 430px;
	padding: 0 10px;
}

#join_join {
	width: 428px;
	height: 38px;
	cursor: pointer;
	background-color: #82E0AA;
	box-shadow: none;
	border: 1px solid #82E0AA;
	border-radius: 10px;
	letter-spacing: 10px;
	font-size: 16px;
	margin-bottom: 10px;
	transition: 0.3s;
}

#join_reset {
	width: 428px;
	height: 38px;
	cursor: pointer;
	background-color: #82E0AA;
	box-shadow: none;
	border: 1px solid #82E0AA;
	border-radius: 10px;
	letter-spacing: 10px;
	font-size: 16px;
	margin-bottom: 10px;
	transition: 0.3s;
}

#join_join:hover {
	background-color: #84D0CA;
	color: #eee;
}

#jsarea {
	width: 100%;
	text-align: center;
	position: relative;
}

#join_reset:hover {
	background-color: #84D0CA;
	color: #eee;
	cursor: pointer;
	color: #eee;
}

#join_index {
	color: #eee;
	text-decoration: none;
	font-size: 12px;
	transition: 0.3s;
}

#join_index:hover {
	color: #BCE6D7;
	letter-spacing: 6px;
}

input:required {
	border-radius: 10px;
	border: 1px dashed red;
}
</style>
<script type="text/javascript">
	

function join_id() {
	var id = document.getElementById("id");
	var id_ch = document.getElementById("id_check");
	
	if (id.value.length < 4) {
		id_ch.innerHTML = "아이디 네글자 이상";
		id.focus();
		id.style.color = 'red';
		id_ch.style.color = 'red';
		return false;
	} else {
		id_ch.innerHTML = "아이디 정상";
		id.style.color = 'black';
		id_ch.style.color = '#BCE6D7';
	}
	
}


function join_name(){
	var name = document.getElementById("name");
	var name_ch = document.getElementById("name_check");
	if (name.value.length < 2) {
		name_ch.innerHTML = "이름 두글자 이상";
		name_ch.style.color = "red";
		name.focus();
		name.style.color = 'red';
		return false;
	} else {
		name_ch.innerHTML = "이름 정상";
		name.style.color = 'black';
		name_ch.style.color = '#BCE6D7';
	}
	
}

function join_pw() {

var pw1 = document.getElementById('pw1');
var pw2 = document.getElementById('pw2');
var pw_ch = document.getElementById('pw_check');

if (pw1.value.length < 4) {
	pw_ch.innerHTML = '비밀번호 4자리 이상';
	pw_ch.style.color = 'red';
	return false;
	
} else {
	if (pw1.value.length > 3) {
	if (pw1.value == pw2.value) {
		pw_ch.innerHTML = '비밀번호 일치';
		pw_ch.style.color = '#BCE6D7';
	} else {
		pw_ch.innerHTML = '비밀번호 일치하지 않음';
		pw_ch.style.color = '#FFFF66';
		return false;
	}
	}
}
}
function join_email(){
var email = document.getElementById("email");
var email_ch = document.getElementById("email_check");

if (email.value.length < 8) {
	email_ch.innerHTML = "이메일 8글자 이상.";
	email.focus();
	email.style.color = "red";
	email_ch.style.color = "red";
	return false;
} else {
	email_ch.innerHTML = "이메일 정상";
	email.style.color = "black";
	email_ch.style.color = "#BCE6D7";
}

}



	
</script>
</head>
<body>
	<%@ include file="./menu.jsp"%>
	<!-- 페이지 포함시키기 -->
	<h2>JOIN US!</h2>
	<div id="join_page">
		<form action="./join" method="post" onsubmit="return join()">
			<div id="jactionp">
				<p id="join_id">
					<span class="jtitle" id="id_check">아이디</span>
					<input type="text" name="id" id="id" required onchange="join_id()">
				</p>
				<p id="join_name">
					<span class="jtitle" id="name_check">이름</span>
					<input type="text" name="name" id="name" required onchange="join_name()">
				</p>
				<p id="join_pw">
					<span class="jtitle" id="pw_check">비밀번호</span>
					<input type="password" id="pw1"	name="pw1" class="jpw1" placeholder="비밀번호 입력" required onchange="join_pw()">
					<input type="password" id="pw2" name="pw2" class="jpw2" placeholder="비밀번호 확인" required onchange="join_pw()">
				</p>
				<p id="join_email">
					<span class="jtitle" id="email_check">이메일</span>
					<input type="email" name="email" id="email" required onchange="join_email()">
				</p>
			</div>
			<div id="jsubb">
				<button type="submit" id="join_join">가입하기</button>
				<p id="jsarea">
					<button type="reset" id="join_reset">reset</button>
					<a href="./index.jsp" id="join_index">로그인하러가기</a>
				</p>
			</div>
		</form>
	</div>
</body>
</html>