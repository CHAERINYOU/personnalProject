package com.itwill.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

/*
 * - 게시판 관리 업무(비즈니스로직,예외처리,트랜젝션,보안,로깅)을 수행하는 클래스
 * - 웹컴포넌트(서블릿,JSP)에서 직접접근(메쏘드호출)하는 클래스(객체)
 * - Dao를 이용해서 데이타베이스를 조작작업(CRUD)하는 클래스
 */
@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	@Qualifier("BoardDaoImplMyBatisMapperInterface")
	private BoardDao BoardDao;

	public BoardServiceImpl() throws Exception {
		
	}

	@Override
	public int insertBorad(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Board> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Board selectBorad(int boardNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyBorad(Board board) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBorad(int boardNo) throws Exception {
		
		return 0;
	}
	
}