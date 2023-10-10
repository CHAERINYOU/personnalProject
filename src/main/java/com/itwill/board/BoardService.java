package com.itwill.board;

import java.util.List;

public interface BoardService {

// 게시판 생성
int insertBorad(Board board) throws Exception;

// 게시판 전체보기
List<Board> selectAll() throws Exception;

// 게시판 상세보기
Board selectBorad(int boardNo) throws Exception;
	
// 게시판 수정
int modifyBorad(Board board) throws Exception;

// 게시판 삭제
int deleteBorad(int boardNo) throws Exception;


}