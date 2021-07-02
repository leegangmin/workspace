<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
}

#menu {
	width: 100%;
	height: 50px;
	background-color: black;
	overflow: hidden;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	height: 50px;
}

li {
	float: left;
	margin: 0 10px;
}

li a {
	display: block;
	color: silver;
	/* font-weight: bold; */
	font-family: "맑은 고딕";
	font-size: 12pt;
	text-align: center;
	padding: 15px;
	text-decoration: none;
}

li a:hover {
	color: white;
}

#logo {
	vertical-align: bottom;
}
</style>

<div id="menu">
	<div id="navi">
		<ul>
			<li><a href="./index.jsp"><img alt="apple" src="./apple.png"
					id="logo" align="center"></a></li>
			<li><a href="./board.jsp">Mac</a></li>
			<li><a href="./freeboard.jsp">iPad</a></li>
			<li><a href="./notice.jsp">iPhone</a></li>
			<li><a href="./shop.jsp">shop</a></li>
		</ul>
	</div>
</div>
