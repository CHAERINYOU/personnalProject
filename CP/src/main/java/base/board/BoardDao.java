package base.board;
import java.util.List;

import base.board.Board;

public interface BoardDao {
	
	// 게시판 생성
	int create(Board boardno) throws Exception;

	// 게시판 수정

	int update(Board boardno) throws Exception;

	// 게시판 삭제
	int remove(String boardno) throws Exception;

	// 게시판 조회
	Board findBoard(String boardno) throws Exception;

	// 게시판 전체조회
	List<Board> findBoardList() throws Exception;

	// 게시판 존재 여부 조회
	boolean existedBoard(String boardno) throws Exception;

}