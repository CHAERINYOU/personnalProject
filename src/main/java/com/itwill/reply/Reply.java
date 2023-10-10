package com.itwill.reply;

import java.util.Date;

public class Reply{
	/*
	 * =================================== 이름 널? 유형
	 * =================================== RNO NOT NULL VARCHAR2(100) 댓글 고유번호 BNO
	 * NOT NULL VARCHAR2(100) 게시물 고유번호 WIRTER NOT NULL VARCHAR2(200) 댓글 작성자 CONTENT
	 * VARCHAR2(300) 댓글 내용 REDATE VARCHAR2(300) 댓글 작성일자
	 * ===================================
	 */

	private int rNo;			// 댓글 고유번호
	private int bNo; 			// 게시물 고유번호
	private String reWriter; 	// 댓글 작성자
	private String reContent; 	// 댓글 내용
	private Date reDate;	    // 댓글 작성일자
	private Date modifyDate; 	// 댓글 수정일자


	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}


	public int getrNo() {
		return rNo;
	}


	public void setrNo(int rNo) {
		this.rNo = rNo;
	}


	public int getbNo() {
		return bNo;
	}


	public void setbNo(int bNo) {
		this.bNo = bNo;
	}


	public String getWriter() {
		return reWriter;
	}


	public void setWriter(String writer) {
		this.reWriter = writer;
	}


	public String getContent() {
		return reContent;
	}


	public void setContent(String content) {
		this.reContent = content;
	}


	public Date getReDate() {
		return reDate;
	}


	public void setReDate(Date reDate) {
		this.reDate = reDate;
	}
	

	public String toString() {
		return "Reply [RNO=" + rNo + ", BNO=" + bNo + ", WIRTER=" + reWriter + ", content=" + reContent + ", REDATE=" + reDate + "]";
	}

}
