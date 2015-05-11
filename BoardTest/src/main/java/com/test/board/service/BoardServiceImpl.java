package com.test.board.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.board.vo.Board;

@Service 
@Transactional
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	  
	public void list(Map map) {
		map.put("boardlist",sqlMapClientTemplate.queryForList("list"));
	}

	public void insert(Board board) {
		sqlMapClientTemplate.insert("insert", board);
	}
 
	public Board select(String seq) { 
		return (Board)sqlMapClientTemplate.queryForObject("select", seq);
	}

	public void delete(String seq) {
		sqlMapClientTemplate.delete("delete",seq);
	}

	public void update(Board board) {
		sqlMapClientTemplate.update("update", board);
	}

}
