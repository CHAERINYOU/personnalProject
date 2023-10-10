package jpa.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate // 필요한 것들만 update해줌
public class Board {
	
	@Id
	@SequenceGenerator(
	name="board_boardno_seq",
	initialValue = 1,
	allocationSize = 1,
	sequenceName = "board_boardno_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "board_boardno_seq")
	/*@GeneratedValue(strategy = GenerationType.SEQUENCE.AUTO) 
	 strategy = GenerationType.SEQUENCE 알아서 시퀀스 테이블 만듬
	 --> 시퀀스는 오라클에서만 사용. 따라서 오토로 변경 필요
	*/
	private Long boardno; //No를 대문자로 하면 안됨
	
	private String title;
	private String writer;
	private String content;
	@CreationTimestamp 		  // JPA insert시 자동으로 값을 생성(Creation과 Update같이 사용 불가)
	@ColumnDefault("sysdate") // JPA insert시 자동으로 값을 생성하지 않음___> 엔터티로 작업할 때 엔터티 매니저가 자동으로 확인
	
	
	
	private LocalDateTime regdate; //현지 시간

	@ColumnDefault("0")		// JPA insert시 자동으로 값을 생성하지 않음
	private Long readcount; 
	
	@ColumnDefault("0")		// JPA insert시 자동으로 값을 생성하지 않음
	private Long groupno; 
	
	@ColumnDefault("1")		// JPA insert시 자동으로 값을 생성하지 않음
	private Long step; 
	
	@ColumnDefault("0")	// JPA insert시 자동으로 값을 생성하지 않음
	private Long depth; 
	
	
}
