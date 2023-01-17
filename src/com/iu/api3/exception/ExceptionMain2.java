package com.iu.api3.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		ExceptionSample1 e1 = new ExceptionSample1();
		ExceptionSample1 e2 = new ExceptionSample1();
		
		try {
			e1.ex2();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		 
		System.out.println("프로그램 종료");

	}

}
                                                                                                                           