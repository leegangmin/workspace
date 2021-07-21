<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style type="text/css">
*{
	margin: 0;
	padding: 0;
}
body{
	margin: 0;
	padding: 0;
	height: 100%;
	width: 100%;
}
#container{
	height: 100%;
	width: 100%;
}
#menu{
	margin: 0 auto;
	height: 100vh;
	width: 150px;
	background-color: #c9c9c9;
	float: left; 
}
#logo{
	margin: 0 auto;
	width: 100%;
	height: 130px;
	text-align: center;
}
#logo img{
	margin: 0 auto;
	height: 130px;
}
#menuItem{
	margin: 0 auto;
	height: 30px;
	width: 130px;
	background-color: #d9d9c9;
	margin: 10px;
	text-align: center;
	line-height: 30px;
}
#main{
	height: auto;
	width: calc(100% - 230px);
	float: right;
	margin: 30px;
	padding: 10px;
	overflow:hidden;
	background-color: #c9c9c9;
}
#mainWrapper{
	margin: 0 auto;
	height: auto;
	width: 500px;
	/* background-color: blue; */
}
ul, li{
	padding: 0;
	margin: 0;
	list-style: none;
	text-align: center;
}

#ulTable{
	/* margin-top: 10px; */
	margin: 10px;
	height: auto;
}
#ulTable > li:first-child > ul > li{
	background-color: #c9c9c9;
	font-weight: bold;
	text-align: center;
}
#ulTable > li > ul{
	clear: both;
	padding: 0 auto;
	position: relative;
	min-width: 40px;
}
#ulTable > li > ul > li{
	float: left;
	font-size: 10pt;
	border-bottom: 1px solid white;
	height: 25px;
	line-height: 25px;
}

#ulTable > li > ul > li:first-child{
	width: 10%;
}
#ulTable > li > ul > li:first-child +li{
	width: 45%;
	text-align: left;
}
#ulTable > li > ul > li:first-child +li + li{
	width: 20%;
}
#ulTable > li > ul > li:first-child +li + li + li{
	width: 15%;
}
#ulTable > li > ul > li:first-child +li + li + li + li{
	width: 10%;
}
</style>
	<div id="logo">
		<img alt="bono" src="./img/logo.png">
	</div>
	<div id="menuItem" onclick="location.href='./index'">게시판</div>
	<div id="menuItem">메뉴</div>
	<div id="menuItem">메뉴</div>
	<div id="menuItem">메뉴</div>
	<div id="menuItem">메뉴</div>
	<div id="menuItem">메뉴</div>
	<div id="menuItem">관리자</div>
