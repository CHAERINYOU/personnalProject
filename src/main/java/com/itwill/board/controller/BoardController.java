package com.itwill.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itwill.board.Board;
import com.itwill.board.BoardService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
/*
  /board_main 
  /board_write_form 
  /board_write_action 
  /board_login_form
  /board_login_action 
  /board_logout_action 
  /board_view 
  /board_modify_form
  /board_modify_action 
  /board_remove_action
 */
@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/board_main")
	public String boardr_main() {
		return "board_main";
	}
	
	@RequestMapping("/board_write_form")
	public String board_write_form() {
		String forward_path = "board_write_form";
		return forward_path;
	}
	
	@PostMapping("board_write_action")
	public String board_write_action(@ModelAttribute("fboard") Board board,Model model) throws Exception {
		String forwardPath = "";
		int rowCount = boardService.insertBorad(board);
		forwardPath="board_view";
		return forwardPath;
	}

	@RequestMapping("/board_view")
	public String board_view(HttpServletRequest request) throws Exception {
		String forwardPath = "";
		forwardPath="board_view";
		return forwardPath;
	}

	@PostMapping("board_modify_form")
	public String board_modify_form(HttpServletRequest request) throws Exception {
		String forwardPath = "";
		
		return forwardPath;
	}

	   @PostMapping("board_modify_action")
	   public String board_modify_action(@ModelAttribute Board board,HttpServletRequest request) throws Exception {
	      String forwardPath = "";
	    
	      return forwardPath;
	   }

	@PostMapping("board_remove_action")
	public String board_remove_action(HttpServletRequest request) throws Exception {
		String forwardPath = "";
		
		return forwardPath;
	}

	/***********GET방식요청시 guest_main redirection*********/
	@GetMapping({
				"board_write_action",
				"board_login_action",
				"board_modify_form",
				"board_modify_action",
				"board_remove_action"
				})
	public String board_get() {
		String forwardPath = "redirect:board_main";
		return forwardPath;
	}
	
	
	/****************Local Exception Handler***********/
	@ExceptionHandler(Exception.class)
	public String board_exception_handler(Exception e) {
		return "board_error";
	}

}















