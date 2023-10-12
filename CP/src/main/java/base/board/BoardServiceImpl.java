package base.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardDao boardDao;
	
	
	@Override
	// 게시판생성
	public int createBoard(Board boardno) throws Exception {
		
		return boardDao.create(boardno);
	}

	@Override
	// 게시판 수정
	public int updateBoard(Board boardno) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.update(boardno);
	}

	@Override
	//게시판 삭제
	public int removeBoard(String boardno) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.remove(boardno);
	}

	@Override
	// 게시판 찾기
	public Board findBoard(String boardno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// 게시판 리스트 찾기
	public List<Board> findBoardList() throws Exception {
		// TODO Auto-generated method stub
		return boardDao.findBoardList();
	}

	@Override
	public boolean existedBoard(String boardno) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
