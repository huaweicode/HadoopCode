package com.soecode.lyf.exception;

/**
 * ��治���쳣
 * @author admin
 *
 */
public class NonumberException extends RuntimeException {
	
	public NonumberException(String message){
		super(message);
	}
	
	public NonumberException(String message,Throwable cause){
		super(message,cause);
	}

}
