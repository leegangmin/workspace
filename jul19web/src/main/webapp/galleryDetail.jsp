<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>갤러리 상세보기</title>
<link href="./css/main.css" rel="stylesheet">
<link href="./css/menu.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script type="text/javascript" src="./js/freeDetail.js"></script>
<script type="text/javascript">
function gallery(gno, code){
	if(code == 'm'){
		if(confirm("해당 글을 수정하실?")){
			location.href="./galleryModify?gno=" + gno;
		}
	} else if (code == 'd') {
		if(confirm("해당 글을 삭제하실?")){
			location.href="./galleryDelete?gno=" + gno;
		}
	}
}
</script>
</head>
<body>
<div id="container">
<div id="menu">
	<c:import url="menu.jsp"/>
</div>
<div id="main">
	<div id="mainWrapper">
		<div id="detail">
			<table>
				<tr>
					<th>제목</th>
					<td>${dto.gtitle }
					<c:if test="${sessionScope.id eq dto.id }"> 
						<button onclick="gallery(${dto.gno }, 'm');">
						<img alt="modify" src="./img/modify.png" height="10px">수정</button>
						<button onclick="gallery(${dto.gno }, 'd');">
						<img alt="delete" src="./img/delete.png" height="10px">삭제</button>
					</c:if>
					</td>
				</tr>
				<tr>
					<th>글쓴이</th>
					<td>${dto.name }(${dto.id })</td>
				</tr>
				<tr>
					<th>쓴날짜</th>
					<td>${dto.gdate }</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td>${dto.gcount }</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${dto.gcontent }
						<br>
						<c:if test="${dto.gfilename ne null }">						
						<img alt="그림" src="./upload/${dto.gfilename }" width="100%"> 
						</c:if>
					</td>
				</tr>
			</table>
		</div>
		<!-- 댓글 유무를 없으면 달아달라고 표시 -->
		<!-- 있으면 그 글의 수 표시 -->
		<!-- 
		<c:if test="${dto.commentcount > 0}">${dto.commentcount }개의 댓글이 있습니다.</c:if>
		<hr>
		<!-- 여기에 댓글 찍기 -->
		<!--
		<c:choose>
			<c:when test="${fn:length(commentList) > 0 }">
				<c:forEach items="${commentList }" var="i">
					<button>${i.gcno } / ${i.name }(<small>${i.id }</small>)</button>
					 ${i.gcdate } <button>${i.gclike }</button> <span>삭제하기</span>
					 	<c:choose>
					 		<c:when test="${i.id eq sessionScope.id }">
					 		<div class="modifyBox"  style="background-color: gray">
					 		<div class="modifyInput">
					 		<div class="fcontent">${i.gccontent }</div>
					 		<div class="fno" style="display: none;">${i.gno }</div>
					 		<div class="fcno" style="display: none;">${i.gcno }</div>
					 		<button>수정하기</button>
							</div>
							</div>
					 		</c:when>
					 		<c:otherwise>
					 		<div class="modifyBox">
					 		<div id="modifyInput">
					 		<div class="gcontent">${i.gccontent }</div>
					 		<div class="gno" style="display: none;">${i.gno }</div>
					 		<div class="gcno" style="display: none;">${i.gcno }</div>
							</div>
					 		</div>
					 		</c:otherwise>
					 	</c:choose>
				<hr>
				</c:forEach>	
			</c:when>
			<c:otherwise>
				댓글이 없습니다.
			</c:otherwise>
		</c:choose> -->
		<!-- 여기에 댓글쓰기 창을 연결합니다. -->
		<!-- Jquery로 할겁니다. 준비물이 뭔지 확인해주세요. -->
		<!-- 로그인 한 사용자만 글을 쓸 수 있도록 해주세요. -->
		<!-- 
		<c:if test="${sessionScope.id ne null }">
		<div class="commentWrite">
			<button>댓글을 쓰려면 클릭하세요.▼</button>
		</div>
		<div id="commentInput"></div>
		</c:if>
		
		 -->
	</div>
	<a href="./gallery">갤 게시판으로</a>
</div>
</div>
</body>
</html>