package com.soecode.lyf.web;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.dto.Result;
import com.soecode.lyf.entity.Book;
import com.soecode.lyf.enums.AppointStateEnum;
import com.soecode.lyf.exception.NonumberException;
import com.soecode.lyf.exception.RepeatAppointException;
import com.soecode.lyf.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BookService bookService;
	
	/**
	 * 查询图书清单
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/list",method = RequestMethod.GET)
	private String list(Model model){
		List<Book> list = bookService.getList();
		model.addAttribute("list",list);
		return "list";
	}
	
	/**
	 * 查看单条图书
	 * @param bookId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{bookId}/detail",method = RequestMethod.GET)
	private String detail(@PathVariable("bookId") Long bookId,Model model){
		if (bookId == null) {
			return "redirect:/book/list";
		}
		Book book = bookService.getById(bookId);
		if (book == null) {
			return "forward:/book/list";
		}
		model.addAttribute("book",book);
		return "detail";
	}
	/**
	 * 图书预定
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	@RequestMapping(value = "/{bookId}/appoint" ,method = RequestMethod.POST,produces={"application/json; charset=utf-8"})
	@ResponseBody
	private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId,@RequestParam("studentId") Long studentId){
		if (studentId == null || studentId.equals("")) {
			return new Result<AppointExecution>(false,"学号不能为空");
		}
		AppointExecution execution = null;
		try {
			execution = bookService.appoint(bookId, studentId);
		} catch (NonumberException e1) {
			execution = new AppointExecution(bookId,AppointStateEnum.NO_NUMBER);
		} catch (RepeatAppointException e2) {
			execution = new AppointExecution(bookId,AppointStateEnum.REPEAT_APPOINT);
		} catch (Exception e) {
			execution = new AppointExecution(bookId,AppointStateEnum.INNER_ERROR);
		}
		return new Result<AppointExecution>(true,execution);
	}

}
