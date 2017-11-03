package com.soecode.lyf.exception;

/**
 * 预约业务异常
 * @author admin
 *
 */
public class AppointException extends RuntimeException{
	
	public AppointException(String message){
		super(message);
	}
	
	public AppointException(String message,Throwable cause){
		super(message,cause);
	}

}
