package com.soecode.lyf.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.soecode.lyf.entity.Book;

public interface BookDao {
	
	/**
	 * ͨ��ID��ѯͼ��
	 * @param id
	 * @return
	 */
	Book queryById(long id);
	
	/**
	 * ��ѯ����ͼ��
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset,@Param("limit") int limit);
	
	/**
	 * ���ٹݲ�����
	 * @param bookId
	 * @return
	 */
	int reduceNumber(long bookId);

}
