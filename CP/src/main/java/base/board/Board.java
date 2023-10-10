package base.board;

import java.time.LocalDateTime;

public class Board {
	private Long boardno; 			// 게시판 번호
	private String title; 			// 게시판 제목
	private String writer; 			// 게시판 작성자
	private String content; 		// 게시판 내용

	private LocalDateTime regdate; 	// 게시판 작성시간

	private Long readcount; 		// 게시판 조회수

	private Long gruopno;

	private Long step; 				// 댓글

	private Long depth;

	
	
	public Board() {
		
	}


	public Board(Long boardno, String title, String writer, String content, LocalDateTime regdate, Long readcounst,
			Long gruopno, Long step, Long depth) {
		super();
		this.boardno = boardno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.readcount = readcounst;
		this.gruopno = gruopno;
		this.step = step;
		this.depth = depth;
	}


	public Long getBoardno() {
		return boardno;
	}


	public void setBoardno(Long boardno) {
		this.boardno = boardno;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public LocalDateTime getRegdate() {
		return regdate;
	}


	public void setRegdate(LocalDateTime regdate) {
		this.regdate = regdate;
	}


	public Long getReadcounst() {
		return readcount;
	}


	public void setReadcounst(Long readcounst) {
		this.readcount = readcounst;
	}


	public Long getGruopno() {
		return gruopno;
	}


	public void setGruopno(Long gruopno) {
		this.gruopno = gruopno;
	}


	public Long getStep() {
		return step;
	}


	public void setStep(Long step) {
		this.step = step;
	}


	public Long getDepth() {
		return depth;
	}


	public void setDepth(Long depth) {
		this.depth = depth;
	}


	@Override
	public String toString() {
		return "Board [boardno=" + boardno + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", regdate=" + regdate + ", readcount=" + readcount + ", gruopno=" + gruopno + ", step=" + step
				+ ", depth=" + depth + "]";
	}

	
	
}
