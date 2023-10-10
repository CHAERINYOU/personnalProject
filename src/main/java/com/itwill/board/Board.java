package com.itwill.board;

import java.util.Date;

public class Board {

		/* =================================== 
		 * 이름 		널? 		유형
		 * =================================== 
		 * BOARDERNO	NOT NULL VARCHAR2(100) (FK)
		 * DATE			NOT NULL DATE(100) 
		 * NAME 		NOT NULL VARCHAR2(200) 
		 * EMAIL 			 	 VARCHAR2(300)
		 * ===================================
		 */
		private int boardNo;
		private String bWriter;		
		private Date date;
		private Date bModifyDate;
		private String title;
		private String content;
		
		
		public Board(int boardNO, String bWriter, Date date, Date bModifyDate, String title, String content) {
			super();
			this.boardNo = boardNO;
			this.bWriter = bWriter;
			this.date = date;
			this.bModifyDate = bModifyDate;
			this.title = title;
			this.content = content;
		}


		public String getbWriter() {
			return bWriter;
		}

		public void setbWriter(String bWriter) {
			this.bWriter = bWriter;
		}

		public Date getbModifyDate() {
			return bModifyDate;
		}

		public void setbModifyDate(Date bModifyDate) {
			this.bModifyDate = bModifyDate;
		}

		
		
		
		public int getBoardNO() {
			return boardNo;
		}

		public void setBoardNO(int boardNO) {
			this.boardNo = boardNO;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		/*
		 *패쓰워드 일치여부 검사 
		
		public boolean isMatchPassword(String password){
			boolean isMatch=false;
			if(this.password.equals(password)){
				isMatch=true;
			}
			return isMatch;
		}
		 */
		@Override
		public String toString() {
			return "Board [BoardNo=" + boardNo + ", date=" + date + ", title=" + title + ", content=" + content + "]";
		}

	}

