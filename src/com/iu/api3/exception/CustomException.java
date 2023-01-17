package com.iu.api3.exception;

public class CustomException extends Exception{ //예외클래스
	
	
	public CustomException() {
		
	}
	
	public CustomException(String message) {
		super(message); //매개변수 보내기
	}
}
