package com.soecode.lyf.test;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.dao.BookDao;
import com.soecode.lyf.entity.Book;

public class BookDaoTest extends BaseTest {
	
	@Autowired
	private BookDao bookDao;
	
//	@Test
	public void testQueryById(){
		long bookId = 1000;
		Book book = bookDao.queryById(bookId);
		System.out.println(book);
		System.out.println(book.getBookId());
	}
	
//	@Test
	public void testQueryAll(){
		List<Book> books = bookDao.queryAll(0, 4);
		for (Book book : books) {
			System.out.println(book.getBookId());
			System.out.println(book.getName());
			System.out.println(book.getNumber());
		}
	}
	
	@Test
	public void testReduceNumber(){
		long bookId = 1000;
		int update = bookDao.reduceNumber(bookId);
		System.out.println("update=" + update);
	}
	
	
	

}
