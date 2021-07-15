package com.gangminlee.dto;
//view에 있는 내용을 다 담기
//내용
//cno, bno, ccoment, clike, cip, cdate, no, name, id

public class CommentDTO {
	//외부에서 보지 못하게 private
	private int cno, bno, clike, no;
	private String ccontent, cip, cdate, name, id;
	//private면 외부에서 보지 못하니까 처리할 수 있는 방법은? getter and setter
	//추가 : cdate 찍어보면 원하는 모양으로 안나옴.
	//		날짜 형식이라 그런데 처리해야함
	//추가 : 해당 오류는 mysql, mariadb에서 발생하는것으로 추정됨.
	//추가 : 처리는 commentview 안에서..
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getClike() {
		return clike;
	}
	public void setClike(int clike) {
		this.clike = clike;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCcontent() {
		return ccontent;
	}
	public void setCcontent(String ccontent) {
		this.ccontent = ccontent;
	}
	public String getCip() {
		return cip;
	}
	public void setCip(String cip) {
		this.cip = cip;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
