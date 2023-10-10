package com.itwill.board;

import java.util.List;

import com.itwill.board.Board;

public interface BoardDao {


	/*
	 * 게시판생성
	 */
	int create(Board board) throws Exception;

	/*
	 * 기존의 게시판 정보 수정
	 */
	int update(Board board) throws Exception;

	/*
	 * 게시판 삭제
	 */
	int remove(int BoardNo) throws Exception;

	/*
	 * 게시판 정보를 데이타베이스에서 찾아서 Board 도메인클래스에 저장하여 반환
	 */
	Board findBoard(int boardNo) throws Exception;

	/*
	 * 모든게시판 정보를  데이타베이스에서 찾아서 List<Board> 콜렉션에 저장하여 반환
	 */
	List<Board> findBoardList() throws Exception;

	/*
	 * 인자로 전달되는 게시판이 존재하는지의 여부를판별
	 */
	boolean existedBoard(int boardNo) throws Exception;
}
