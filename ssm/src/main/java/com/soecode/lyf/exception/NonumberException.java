package com.soecode.lyf.exception;

/**
 * ¿â´æ²»×ãÒì³£
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
