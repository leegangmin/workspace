package com.gangminlee.dto;

import java.util.Date;

//view에 있는 내용을 다 담기
//내용
//cno, bno, ccoment, clike, cip, cdate, no, name, id

public class CommentDTO {
	//외부에서 보지 못하게 private
	private int fno, fcno;
	private String content;
	private Date cdate;
	//private면 외부에서 보지 못하니까 처리할 수 있는 방법은? getter and setter
	//추가 : cdate 찍어보면 원하는 모양으로 안나옴.
	//		날짜 형식이라 그런데 처리해야함
	//추가 : 해당 오류는 mysql, mariadb에서 발생하는것으로 추정됨.
	//추가 : 처리는 commentview 안에서..
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public int getFcno() {
		return fcno;
	}
	public void setFcno(int fcno) {
		this.fcno = fcno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	
	
	
	
}
