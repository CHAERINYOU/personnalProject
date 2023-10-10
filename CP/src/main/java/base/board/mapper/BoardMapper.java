package base.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import base.board.Board;
import base.user.User;

@Mapper
public interface BoardMapper {
	
	//게시판 생성
	public int create(Board board);
	
	//게시판 업데이트
	public int update(int boardno);
	
	//게시판 삭제
	public int remove(int boardno);
	
	//게시판 1개 찾기
	public Board findBoard(int Boardno);
	
	//게시판 전체찾기
	public List<Board> findBoardList();
	
	
}
	
