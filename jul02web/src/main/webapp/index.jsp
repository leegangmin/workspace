<%@page import="com.gangminlee.dao.LogDAO"%>
<%@page import="com.gangminlee.dto.LogDTO"%>
<%@page import="com.gangminlee.util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
if(session.getAttribute("id") != null){
	response.sendRedirect("./board.jsp");
}

//로그남기기
//상대방 ip를 알아와서 데이터베이스에 저장하겠습니다.
		String ip = Util.getIP(request);
//아이피 서버로 보내서 저장시키기
//LogDAO?   보드DAO, loginDAO

		//DTO만들기
		LogDTO dto = new LogDTO();
		//값 저장하기
		dto.setLog_ip(ip);
		dto.setLog_taget("index.jsp");
		if(session.getAttribute("id") != null){
			dto.setLog_id((String) session.getAttribute("id"));
		}
		
		//DAO로보내서 저장시키기
		LogDAO.insertLog(dto);
		//DB에서 확인해보기
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<style type="text/css">
body{
}
.loginbox {
	position:absolute;
	margin: -100px 0 0 -200px;
	top:50%;
	left:50%;
	width: 400px;
	height: 200px;
	border: 1px solid gray;
	padding: 20px 20px;
}

#loginimg {
	height: 100%;
	width: calc(100% / 2);
	float: left;
	box-sizing: border-box;
	text-align: center;
}
#loginimg img{
	height: 100%;
	vertical-align: middle;
}

#logininput {
	height: 200px;
	width: 200px;
	float: left;
	margin-top: 30px;
	text-align: center;
	box-sizing: border-box;
}
#logininput input, #logininput button{
	margin:0px;
	padding:0px;
	border: 1px gray solid;
	width: 100%;
	height: 30px;
	margin-bottom: 10px;
}
</style>
</head>
<body>
	<%@ include file="./menu.jsp"%>
	<div class="loginbox">
		<div id="loginimg">
			<img alt="bonobono" src="./bono.jpg">
		</div>
		<div id="logininput">
			<!-- ./loginAction 서블릿으로 전송하겠습니다.
				java + web -> servlet
				java코드 속에 html코드를 넣었어요.
				서블릿 2.5이후 기술은 그냥 사용.
				서블릿 2.5이전 기술은 web.xml에 설정을 적어줍니다.
				
				html + java
				html코드 속에 자바를 넣었어요.
			-->
			<form action="./loginAction" method="post" onsubmit="return check()">
				<input type="text" id="id" name="id" 
				placeholder="아이디를 입력하세요" required="required">
				<input type="password" id="pw" name="pw" 
				placeholder="암호를 입력하세요" required="required">
				<button type="submit">LOGIN</button>
				<a href="./join.jsp">가입하기</a> | 
				<a href="./idpw.jsp">ID/PW 찾기</a>
			</form>
				<!-- <button type="button" onclick="location.href='./join.jsp'">가입하기</button> -->
		</div>
	</div>
	<%
	if(request.getParameter("error") != null){
	%>
	<script type="text/javascript">
		alert("올바른 ID와 암호를 입력하세요.");
	</script>	
	<%
	}
	%>
</body>
</html>