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
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

	


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
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
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
#comment_right {
	display: inline-block;
	float: right;
	padding-right: 10px;
}
#comment_right img{
	height: 20px;
	vertical-align: text-bottom;
}
</style>
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
function likeup(cno, bno){
	//다시 돌아오기 위해서 bno도 보냅니다 
	location.href='./likeUp?cno='+cno+"&bno="+bno;
}


$(function(){
	$(".likeup2").on("click", function(){
		//alert("!");
		var like = $(".likeup2").siblings("span").html();
		alert(like);
		$(".likeup2").siblings("span").html(Number(like)+1);
	});
	
	$(".likeup1").click(function(){
		var like = $("#likeup1").text();
		$(this).text(Number(like) + 1);
	});
});

function dele1(cno, bno){
	//alert(cno + " : " + bno)
	if(confirm("댓글을 삭제하시겠습니까")){
		alert("삭제합니다.");
		location.href="deleteComment?cno="+cno+"&bno="+bno;
	}
}
function modify(cno, bno){
	//alert(cno + " : " + bno);
	if(confirm("댓글을 수정하시겠습니까")){
		location.href="modifyComment?cno="+cno+"&bno="+bno;
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
			<c:set var="dtoId" value="<%=dto.getId()%>" />
			<c:if test="${sessionScope.id eq dtoId }">
				<img alt="delete" src="./delete.png" height="20px"
					onclick="return del(<%=dto.getBno()%>);"
					style="vertical-align: middle;">
				<img alt="update" src="./update.png" height="20px"
					onclick="return update(<%=dto.getBno()%>); "
					style="vertical-align: middle;">
			</c:if>
		</div>
		<div id="date">
			<div id="date2"><%=dto.getName()%><br>(<%=dto.getId()%>)
			</div>
			<div id="date2"><%=dto.getBcount()%><br><%=dto.getBdate()%></div>
		</div>
		<div id="content"><%=dto.getBcontent()%></div>
	</div>
	<div id="comments">
		<c:forEach items="<%=list%>" var="i">
			<div id="comment">
				<div id="commentId">
					${i.cno } / ${i.name }<small>(${i.id })</small>
					<c:if test="${i.id eq sessionScope.id }">
						<img alt="delete" src="./delete.png" height="15px" onclick="dele1(${i.cno }, ${i.bno })">
						<img alt="modify" src="./update.png" height="15px" onclick="modify(${i.cno }, ${i.bno })">
					</c:if>
					
					<span id="comment_right">
						<img alt="time" src="./img/time.png">
						<fmt:formatDate value="${i.cdate }" pattern="yyyy-MM-dd HH:mm:ss"/> | 
						<img  class="likeup2" alt="like" src="./img/like.png" onclick="likeup3(${i.cno }, ${i.bno })">
						<span class="likeup1" id="likeup1">${i.clike }</span> | 
						<img alt="ip" src="./img/ip.png" title="${i.cip }">
					</span>
				</div>
				<div id="commentContent">${i.ccontent }</div>
			</div>
		</c:forEach>
	</div>
	<div id="commentWrite">
		<c:choose>
			<c:when test="${sessionScope.id ne null }">
				<div>
					<form action="./comment" method="post" onsubmit="return check()">
						<textarea name="comment" id="comment1"></textarea>
						<input type="hidden" name="bno" value="<%=dto.getBno()%>">
						<button type="submit" id="commentBtn">댓글쓰기</button>
					</form>
				</div>
			</c:when>
			<c:otherwise>
				<div id="loginBtnBox">
					<button id="loginBtn" onclick="location.href='./index.jsp'">로그인해주세요</button>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
	<button onclick="location.href='./board.jsp'">게시판으로</button>
</body>
</html>