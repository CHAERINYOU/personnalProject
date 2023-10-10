package com.itwill.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.itwill.board.Board;
import com.itwill.user.User;
@Mapper
public interface BoardMapper {
	/*
	<insert id="create" parameterType="com.itwill.board.Board">
			insert into boardinfo(boardno,bwriter,date,bmodifydate,title,content) 
			values(#{boardNo},#{bWriter},#{date},#{bModifyDate},#{title},#{content})
	</insert>
	*/
	
	public int create(Board board);
	/*
	<update id="update" parameterType="com.itwill.board.Board">
		update  boardrinfo 
		set title=#{title},content=#{content},bmodifydate=#{bmodifydate} 
		where boardno=#{boardno}
	</update>
	*/
	
	
	public int update(Board board);
	/*
	<delete id="remove" parameterType="java.lang.String">
		delete boardrinfo where boardno=#{boardno}
	</delete>
	 */
	
	
	public int remove(int boardNo);
	/*
	<select id="findUser" parameterType="string" resultType="com.itwill.user.User">
		select userid,password,name,email from userinfo where userid=#{userId}
	</select>
   */
	
	
	public Board findBoard(int boardNo);
	/*
	<select id="findBoard" parameterType="java.lang.String"
						  resultType="com.itwill.board.Board"	>
		select boardno,bwirter,date,bmodifydate,title,content from boardinfo 
		where boardno=#{boardno}
	</select>
   */
	
	
	public List<Board> findBoardList();
	/*
	<select id="findBoardList" resultType="com.itwill.board.Board">
		select boardno,bwirter,date,bmodifydate,title,content from boardinfo
	</select>
	*/
	
	
	public int existedBoard(int boardNo);
	/*
	 <select id="existedBoard" 	parameterType="java.lang.String" 
								resultType="java.lang.Integer">
		select count(*) cnt from boardinfo where boardno=#{boardno}
	</select>
	 */ 
}