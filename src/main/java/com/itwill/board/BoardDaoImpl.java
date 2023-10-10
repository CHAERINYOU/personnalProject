package com.itwill.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.itwill.board.mapper.BoardMapper;


public class BoardDaoImpl implements BoardDao{

	@Autowired(required = false)
	private BoardMapper boardMapper;
	
	
	public BoardDaoImpl() {
		System.out.println("#### BoardDaoImplMyBatisMapperInterface() : 디폴트생성자 호출  ");
	}
	
	public BoardMapper getBoardMapper() {
		return boardMapper;
	}

	
	public void setBoardMapper(BoardMapper boardMapper) {
		System.out.println("#### BoardDaoImplMyBatisMapperInterface() : setBoardMapper() 메쏘드호출  ");
		this.boardMapper = boardMapper;
	}
	
	
	@Override
	public int create(Board board) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.create(board);
	}

	@Override
	public int update(Board board) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.update(board);
	}

	@Override
	public int remove(int BoardNo) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.remove(BoardNo);
	}

	@Override
	public Board findBoard(int boardNo) throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.findBoard(boardNo);
	}

	@Override
	public List<Board> findBoardList() throws Exception {
		// TODO Auto-generated method stub
		return boardMapper.findBoardList();
	}

	@Override
	public boolean existedBoard(int boardNo) throws Exception {
		int count = boardMapper.existedBoard(boardNo);
		if(count==1) {
			return true;
		}else {
			return false;
		}
	}


}