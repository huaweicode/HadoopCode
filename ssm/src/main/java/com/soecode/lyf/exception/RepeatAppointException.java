package com.soecode.lyf.exception;

/**
 * ÷ÿ∏¥‘§‘º“Ï≥£
 * @author admin
 *
 */
public class RepeatAppointException extends RuntimeException {
	
	public RepeatAppointException(String message){
		super(message);
	}
	
	public RepeatAppointException(String message,Throwable cause){
		super(message,cause);
	}
	

}
