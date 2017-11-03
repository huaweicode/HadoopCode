package com.soecode.lyf.test;

import java.awt.Insets;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.soecode.lyf.dao.AppointmentDao;
import com.soecode.lyf.entity.Appointment;

public class AppointmentDaoTest extends BaseTest {
	
	@Autowired
	private AppointmentDao appointmentDao;
	
//	@Test
	public void testInsertAppointment(){
		long bookId = 3000;
		long studentId = 12345678910L;
		int insert = appointmentDao.insertAppointment(bookId, studentId);
		System.out.println("insert=" + insert);
	}
	@Test
	public void testQueryByKeyWithBook() throws Exception{
		long bookId = 1000;
		long studentId = 12345678910L;
		Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
		System.out.println(appointment.getBookId());
	}
	

}
