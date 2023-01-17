package com.iu.api3.exception;

import java.util.Random;

public class ExceptionMain1 {

	public static void main(String[] args) {
		String num = null;
		Random random = new Random();
		int n = random.nextInt(2);
		if(n==0) {
			num="test";
		}
		
	
		//n이 0이라면 실행이되고 n이 1이라면 실행이 되지 않는다 -> NullPointerException
		
		try {
			int a=10;
			System.out.println(3/n);
			//throw new ArithmeticException();
			System.out.println(num.charAt(0));
			//throw new NullPointerException();
			
			//다형성
		}catch(ArithmeticException e) {
			e.printStackTrace(); //어디서 문제가 생긴지 모를때 출력
			System.out.println("0으로 나눌 수 없습니다");
		}catch(RuntimeException e) {
			e.printStackTrace(); 
		}catch (Exception e) { //보통 Exeption으로 받음
			
		}catch(Throwable e) { //밑으로 갈수록 넓은 범위 -> 부모 클래스
			
		}
		
		
		
		System.out.println("종료합니다");
		
	}

}
