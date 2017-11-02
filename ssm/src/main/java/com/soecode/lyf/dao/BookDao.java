package com.soecode.lyf.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.soecode.lyf.entity.Book;

public interface BookDao {
	
	/**
	 * 通过ID查询图书
	 * @param id
	 * @return
	 */
	Book queryById(long id);
	
	/**
	 * 查询所有图书
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset,@Param("limit") int limit);
	
	/**
	 * 减少馆藏数量
	 * @param bookId
	 * @return
	 */
	int reduceNumber(long bookId);

}
