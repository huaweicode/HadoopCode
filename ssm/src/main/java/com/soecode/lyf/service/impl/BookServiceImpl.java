package com.soecode.lyf.service.impl;

import java.util.List;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soecode.lyf.dao.AppointmentDao;
import com.soecode.lyf.dao.BookDao;
import com.soecode.lyf.dto.AppointExecution;
import com.soecode.lyf.entity.Appointment;
import com.soecode.lyf.entity.Book;
import com.soecode.lyf.enums.AppointStateEnum;
import com.soecode.lyf.exception.AppointException;
import com.soecode.lyf.exception.NonumberException;
import com.soecode.lyf.exception.RepeatAppointException;
import com.soecode.lyf.service.BookService;
@Service
public class BookServiceImpl implements BookService{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//ע��service����
	@Autowired
	private BookDao bookDao;
	
	@Autowired 
	private AppointmentDao appointmentDao;
	
    public Book getById(long bookId) {
		return bookDao.queryById(bookId);
	}

	public List<Book> getList() {
		return bookDao.queryAll(0, 1000);
	}
	/**
	 * ͼ��ԤԼ
	 */
    @Transactional
	public AppointExecution appoint(long bookId, long studentId) {
    	try {
    		//�����
			int update = bookDao.reduceNumber(bookId);
			if (update <= 0) {//��治��
				throw new NonumberException("��治��");
			} else {
				//ִ��ԤԼ����
				int insert = appointmentDao.insertAppointment(bookId, studentId);
				if (insert <= 0) {
					throw new RepeatAppointException("�ظ�ԤԼ");
				} else {//ԤԼ�ɹ�
					Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
					return new AppointExecution(bookId,AppointStateEnum.SUCCESS,appointment);
				}
			}
		} catch (NonumberException e1) {
			throw e1;
		} catch (RepeatAppointException e2) {
			throw e2;
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			throw new AppointException("appoint inner error:" + e.getMessage());
		}
	}

}
