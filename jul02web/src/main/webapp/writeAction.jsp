<%@page import="com.gangminlee.dao.BoardDAO"%>
<%@page import="com.gangminlee.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");//한글처리
String title = request.getParameter("title");
String content = request.getParameter("content");
//글쓴이 ---- 나중에는 세션으로 변경합니다.
int no = 1;

BoardDTO dto = new BoardDTO();
dto.setBtitle(title);
dto.setBcontent(content);
dto.setId(String.valueOf(no));//임시로


//데이터베이스로 보내기 BoardDAO insert(dto)
BoardDAO dao = new BoardDAO();
dao.insert(dto);

//저장 후 board로 이동하기
response.sendRedirect("./board.jsp");
%>



