package com.test.board.service;

import java.util.Map;

import com.test.board.vo.Board;

public interface BoardService {
	
	public void list(Map map);
	
	public void insert(Board board);
	
	Board select(String seq);
	
	public void delete(String seq);
	
	public void update(Board board);
	
}
