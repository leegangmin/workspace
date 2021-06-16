<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>list</h1>
	<ul type=circle><!-- circle/disc/square -->
		<li>소나무</li>
		<li>대나무</li>
		<li>사철나무</li>
	</ul>
	<ol type=1 start=5 reversed><!-- i,I,a -->
		<li>퇴근하기</li>
		<li>장보기</li>
		<li>요리하기</li>
		<li>청소하기</li>
		<li>잠자기</li>
		
		
	</ol>
	<hr>
	<input type=text>
	<input type="password">
	<input type="number">
	<input type="email">
	<input type="file">
	<input type="range" max=1000 min=10 value=5>
	<input type="submit">
	<input type="reset">
	<input type="time">
	<input type="color">
	<input type="button" value=button>
	<button>button</button>
	
	<hr>
	<select>
		<option>사과</option>
		<option>배</option>
		<option>포도</option>
		<option>오렌지</option>
		<option>오이</option>
		
	</select>
	
	<a href=java.jsp>java와 연결</a>
	
	
</body>
</html>