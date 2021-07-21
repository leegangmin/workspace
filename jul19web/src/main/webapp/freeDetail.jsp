<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
<style type="text/css">
table {
	margin: 0 auto;
	min-height: 300px;
	height: auto;
	width: 300px;
	border-collapse: collapse;
}

table td {
	padding-left: 10px;
}

table tr {
	border-bottom: 1px white solid;
}

table tr:last-child {
	height: 200px;
}

#commentInput {
	width: 500px;
	height: 150px;
	background-color: gray;
}

#commentInput textarea {
	margin: 0;
	padding: 0;
	width: 100%;
	height: 120px;
}

#commentInput button {
	margin: 0;
	padding: 0;
	height: 30px;
	width: 100%;
}
</style>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						/* 	//alert("!");
						$("#commentInput").hide();
						$(".commentWrite").click(function(){
							var offset = $(".commentWrite").offset();
							$("html, body").animate({scrollTop:offset.top},500);
							//alert("!!");
							//$(".commentWrite").hide();
							$(this).text("숨기려면 클릭하세요");
							$("#commentInput").show("slow");
						});
						
						 */

						//수정하는 기능
						$(".modifyInput").click(function() {
											//var fcontent = $(this).children().first().text();
											//var fcno = $(this).children().last().text();
											//아래로 변경
											var fcontent = $(this).children(".fcontent").text();
											var fcno = $(this).children(".fcno").text();
											var fno = $(this).children(".fno").text();
											$(this).parent().html(
															"<form action='./commentModify' method='post'>"
															+"<textarea name='content'>"+fcontent+"</textarea>"
															+"<input type='hidden' name='fcno' value='"+fcno+"'>"
															+"<input type='hidden' name='fno' value='"+fno+"'>"
															+"<br><button>수정하기</button></form>"
															+"<div class='clear1'><button>수정취소</button></div>");
															//content변경 + 댓글번호
							$(".clear1").click(function(){
							//alert(htmlB);
							$(this).parent().html('<div class="modifyInput">수정하기'
					 		+'<div class="fcontent">'+fcontent+'</div>'
					 		+'<div class="fno" style="display: none;">'+fno+'</div>'
					 		+'<div class="fcno" style="display: none;">'+fcno+'</div>'
						 	+'</div>');
			});
			});

						//댓글쓰는 기능
						var now = 0;
						$("#commentInput").hide();
						$(".commentWrite")
								.bind(
										"click focus",
										function() {
											var offset = $(".commentWrite")
													.offset();
											$("html, body").animate({
												scrollTop : offset.top
											}, 900);
											if (now == 0) {
												$("#commentInput").slideDown(
														1000);
												$("#commentInput")
														.html(
																'<form action="" method="post"><textarea name="content"></textarea><input type="hidden" name="fno" value="${dto.fno }"><button>댓글쓰기</button></form>');
												$(this).text("닫으려면 클릭하세요.▲");
												now = 1;
											} else {
												$("#commentInput")
														.slideUp(1000);
												$(this).text("댓글을 쓰려면 클릭하세요.▼");
												now = 0;
											}
										});
					});
</script>
</head>
<body>
	<div id="container">
		<div id="menu">
			<c:import url="menu.jsp" />
		</div>
		<div id="main">
			<div id="mainWrapper">
				<div id="detail">
					<table>
						<tr>
							<th>제목</th>
							<td>${dto.ftitle }</td>
						</tr>
						<tr>
							<th>글쓴이</th>
							<td>${dto.name }(${dto.id })</td>
						</tr>
						<tr>
							<th>쓴날짜</th>
							<td>${dto.fdate }</td>
						</tr>
						<tr>
							<th>조회수</th>
							<td>${dto.fcount }</td>
						</tr>
						<tr>
							<th>내용</th>
							<td>${dto.fcontent }</td>
						</tr>
					</table>
				</div>
				<!-- 댓글 유무를 없으면 달아달라고 표시 -->
				<!-- 있으면 그 글의 수 표시 -->
				<c:choose>
					<c:when test="${dto.commentcount > 0}">			
				${dto.commentcount }개의 댓글이 있습니다 	
			</c:when>
					<c:otherwise>
				댓글이 없습니다. 댓글을 달아주세요.
			</c:otherwise>
				</c:choose>
				<hr>
				<!-- 여기에 댓글 찍기 -->
				<c:choose>
					<c:when test="${fn:length(commentList) > 0 }">
						<c:forEach items="${commentList }" var="i">
							<button>${i.fcno }
								/ ${i.name }(<small>${i.id }</small>)
							</button> ${i.fcdate }
					<button>${i.fclike }</button>
							<div class="modifyBox">
								<div class="modifyInput">
									수정하기
									<div class="fcontent">${i.fccontent }</div>
									<div class="fno" style="display: none;">${i.fno }</div>
									<div class="fcno" style="display: none;">${i.fcno }</div>
								</div>
							</div>
							<hr>
						</c:forEach>
					</c:when>
					<c:otherwise>
				댓글이 없습니다.
			</c:otherwise>
				</c:choose>
				<!-- 여기에 댓글쓰기 창을 연결합니다. -->
				<!-- Jquery로 할겁니다. 준비물이 뭔지 확인해주세요. -->
				<div class="commentWrite">댓글을 달기 위해서는 클릭하세요.</div>
				<div id="commentInput">
					<form action="" method="post">
						<textarea name="content"></textarea>
						<input type="hidden" name="fno" value="${dto.fno }">
						<button>댓글쓰기</button>
					</form>
				</div>
			</div>
			<a href="./index">게시판으로</a>
		</div>
	</div>









</body>
</html>