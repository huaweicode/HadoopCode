package com.soecode.lyf.dao;

import org.apache.ibatis.annotations.Param;

import com.soecode.lyf.entity.Appointment;

public interface AppointmentDao {
	
	/**
	 * 插入预约图书记录
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	int insertAppointment(@Param("bookId") long bookId,@Param("studentId") long studentId);
	
	/**
	 * 通过主键查询预约记录，并携带图书实体
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") long bookId,@Param("studentId") long studentId);

}
