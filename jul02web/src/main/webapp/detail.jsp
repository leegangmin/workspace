<%@page import="com.gangminlee.dao.LogDAO"%>
<%@page import="com.gangminlee.dto.LogDTO"%>
<%@page import="com.gangminlee.dto.CommentDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.net.CookieManager"%>
<%@page import="com.gangminlee.dao.CommentDAO"%>
<%@page import="com.gangminlee.dto.BoardDTO"%>
<%@page import="com.gangminlee.dao.BoardDAO"%>
<%@page import="com.gangminlee.util.Util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>	


<%
String ip = Util.getIP(request);
//DTO만들기
LogDTO ldto = new LogDTO();
//값 저장하기
ldto.setLog_ip(ip);
ldto.setLog_taget("detail.jsp");
if(session.getAttribute("id") != null){
ldto.setLog_id((String) session.getAttribute("id"));
}
//DAO로보내서 저장시키기
LogDAO.insertLog(ldto);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글상세보기</title>
<style type="text/css">
#detail {
	margin: 0 auto;
	width: 800px;
	min-height: 500px;
	background-color: silver;
}

#title {
	width: 100%;
	height: 40px;
	padding: 10px;
	text-align: center;
	border-bottom: 2px solid black;
	box-sizing: border-box;
}

#date {
	width: 100%;
	height: 50px;
	border-bottom: 1px solid gray;
}

#date2 {
	width: 45%;
	height: 30px;
	text-align: center;
	float: left;
	margin: 5px;
	padding: 5px;
}

#content {
	min-height: calc(100% - 91px);
	width: 100%;
	padding: 20px;
	box-sizing: border-box;
}

#comments {
	margin: 0 auto;
	width: 800px;
	min-height: 100px;
}

#comment {
	width: 100%;
	height: 100px;
	margin: 10px 0;
}

#commentId #commentContent {
	width: 100%;
	height: auto;
}

#commentId {
	height: 20px;
	padding: 10px;
	background-color: #c0c0c0;
	border-bottom: 1px solid black;
}

#commentContent {
	padding: 10px;
	min-height: 50px;
	background-color: olive;
	box-sizing: border-box;
}

#commentWrite {
	margin: 0 auto;
	width: 800px;
	min-height: 100px;
	background-color: gray;
	text-align: right;
	padding: 10px;
	box-sizing: border-box;
}

#commentWrite textarea {
	margin: 0;
	padding: 0;
	width: 670px;
	height: 100px;
	padding: 10px;
	vertical-align: middle;
	resize: vertical;
	box-sizing: border-box;
}

#commentBtn {
	margin: 0;
	padding: 0;
	width: 100px;
	height: 100px;
	vertical-align: middle;
}
#loginBtnBox{
	margin: 0 auto;
	padding: 0;
	height: 100px;
	width: 800px;
	line-height: 100px;
	vertical-align: middle;
	text-align: center;
}
#loginBtn{
	margin: 0;
	padding: 0;
	height: 50px;
	width: 150px;
	line-height:0px;
	vertical-align: middle;
}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script type="text/javascript">
function update(bno){
	if(confirm("수정하시겠습니까?")){
		location.href="update?bno="+bno;
	}
}
function del(bno){
	if(confirm("삭제하시겠습니까")){
		alert("삭제합니다.");
		location.href="delete?bno="+bno;
	}
}
function check(){
	var comment = $("#comment1").val();
	if(comment.length < 5){
		alert("댓글은 5자 이상이어야 합니다.");
		$("#comment1").focus();
		return false;
	}
}
</script>
</head>
<body>
	<%@ include file="./menu.jsp"%>
	<h1>detail</h1>
	<%
	int bno = Util.str2Int2(request.getParameter("bno"));
	BoardDAO dao = new BoardDAO();
	BoardDTO dto = dao.detail(bno);
	//댓글 뽑기 = 보드 출력 + bno
	//1. DTO 만들기 CommemtDTO view의 모든 컬럼을 담기
	//2. DAO 만들기 CommentDAO
	//3. 메소드 만들기 commentList(bno)	DBConn?
	//4. 값 받아오기 ArrayList<CommentDTO> List =
	CommentDAO cdao = new CommentDAO();
	ArrayList<CommentDTO> list = cdao.commentList(bno);
	
	//값이 오는지 테스트
	/*for(CommentDTO cdto : list){
		System.out.print(cdto.getCno());
		System.out.print(cdto.getCcontent());
		System.out.println();
		
	}
	*/
	%>
	<hr>
	<div id="detail">
		<div id="title">
			<%=dto.getBtitle()%>
			<c:set var="dtoId" value="<%=dto.getId() %>"/>
			<c:if test="${sessionScope.id eq dtoId }">
			<img alt="delete" src="./delete.png" height="20px"
				onclick="return del(<%=dto.getBno()%>);"
				style="vertical-align: middle;"> <img alt="update"
				src="./update.png" height="20px"
				onclick="return update(<%=dto.getBno()%>); "
				style="vertical-align: middle;">
			</c:if>
		</div>
			
			
			<!-- 
			<%
			//if (session.getAttribute("id") != null && ((String) session.getAttribute("id")).equals(dto.getId())) {
			%>
			<img alt="delete" src="./delete.png" height="20px"
				onclick="return del(<%=dto.getBno()%>);"
				style="vertical-align: middle;"> <img alt="update"
				src="./update.png" height="20px"
				onclick="return update(<%=dto.getBno()%>); "
				style="vertical-align: middle;">
			<%
			//}
			%>
			 -->
		<div id="date">
			<div id="date2"><%=dto.getName()%><br>(<%=dto.getId()%>)
			</div>
			<div id="date2"><%=dto.getBcount()%><br><%=dto.getBdate()%></div>
		</div>
		<div id="content"><%=dto.getBcontent()%></div>
	</div>
	<div id="comments">
		<c:forEach items="<%=list %>" var="i">
			<div id="comment">
				<div id="commentId"> ${i.name } / ${i.id } / ${i.cdate } / ${i.cip } Like ${i.clike }</div>
				<div id="commentContent">${i.ccontent }</div>
			</div>
		</c:forEach>
	</div>
	<div id="commentWrite">
	
	<!-- IMPORTANT!!!!!!!!!!!! -->
	<!-- <c:set value="5" var="x"/>
	<c:choose>
		<c:when test="${x eq 1 }">YEAH</c:when>
		<c:when test="${x ne 2 }">not equal</c:when>
		<c:when test="${x gt 5 }">greater than 5</c:when>
		<c:when test="${x lt 5 }">less than 5</c:when>
		<c:when test="${x ge 5 }">greater than and equal 5</c:when>
		<c:when test="${x le 5 }">less than and equal 5</c:when>
		<c:otherwise>NOPE</c:otherwise>
	</c:choose>
	-->
	<c:choose>
		<c:when test="${sessionScope.id eq null }">
			<div id="loginBtnBox">
				<button id="loginBtn" onclick="location.href='./index.jsp'">로그인해주세요</button>
			</div>
		</c:when>
		<c:otherwise>
			<div>
				<form action="./comment" method="post" onsubmit="return check()">
				<textarea name="comment" id="comment1"></textarea>
				<input type="hidden" name="bno" value="<%=dto.getBno()%>">
				<button type="submit" id="commentBtn">댓글쓰기</button>
				</form>
			</div>
		</c:otherwise>
	</c:choose>
	
	
	</div>
	<button onclick="location.href='./board.jsp'">게시판으로</button>








</body>
</html>