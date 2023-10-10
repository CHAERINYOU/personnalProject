package com.itwill.reply;

import java.util.List;

public interface ReplyDao {

	/*
	 * 답글생성
	 */
	int create(Reply Reply) throws Exception;

	/*
	 * 기존의 답글 정보 수정
	 */
	int update(Reply Reply) throws Exception;

	/*
	 * 답글 삭제
	 */
	int remove(int ReplyNo) throws Exception;

	/*
	 * 답글 정보를 데이타베이스에서 찾아서 Reply 도메인클래스에 저장하여 반환
	 */
	Reply findReply(int ReplyNo) throws Exception;

	/*
	 * 모든답글 정보를  데이타베이스에서 찾아서 List<Reply> 콜렉션에 저장하여 반환
	 */
	List<Reply> findReplyList() throws Exception;

	/*
	 * 인자로 전달되는 답글이 존재하는지의 여부를판별
	 */
	boolean existedReply(int ReplyNo) throws Exception;


}