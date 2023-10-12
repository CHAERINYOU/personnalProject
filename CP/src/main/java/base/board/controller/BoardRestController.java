package base.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import base.board.BoardDao;
import base.board.BoardService;

@RestController
@RequestMapping("/board")
public class BoardRestController {
	@Autowired
	BoardService boardService;

	
	
}
