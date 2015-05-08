package com.test.board;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {   
	      
	@Autowired 
	BoardService boardService;
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Map map) {
		logger.info("실행완료");
		boardService.list(map);  
		return "list";
	}// end list
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public ModelAndView view(@RequestParam(value="seq")String seq){
		ModelAndView mav = new ModelAndView();
		
		Board board = boardService.select(seq);
		mav.addObject("board_data", board);
		mav.setViewName("view");
		
		return mav;
	}
	@RequestMapping(value = "/writeForm.do", method = RequestMethod.GET)
	public String writeForm(){
		 
		return "write";
	}// end writeForm
	  
	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public ModelAndView write(HttpServletRequest request){
		String seq = request.getParameter("seq");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		logger.info("sub : "+ subject+"content : "+ content);
		ModelAndView mav =  new ModelAndView();
		Board board = new Board();
		board.setSeq(seq);
		board.setSubject(subject);
		board.setContent(content);
		boardService.insert(board);
		mav.setViewName("redirect:/list.do");
			 
			return mav;
		}// end write
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public ModelAndView delete(@RequestParam(value="seq", required = true)String seq){
		 ModelAndView mav=  new ModelAndView();
		boardService.delete(seq);
		mav.setViewName("redirect:/list.do");  
		return mav;
	}// end delete
	
	@RequestMapping(value = "/updateForm.do", method = RequestMethod.GET)
	public ModelAndView updateForm(@RequestParam(value="seq",required = true)String seq ){
		ModelAndView mav = new ModelAndView();
		 Board board = boardService.select(seq);
		 mav.addObject("board_data",board);
		 mav.setViewName("update");
		return mav;
	}// end updateForm
	
	@RequestMapping(value = "/update.do", method = RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request){
		String seq = request.getParameter("seq");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		ModelAndView mav =  new ModelAndView();
		Board board = boardService.select(seq);
		board.setSubject(subject);
		board.setContent(content);
		boardService.update(board); 
		mav.setViewName("redirect:/list.do");
			 
			return mav;
		}// end update
	
}
