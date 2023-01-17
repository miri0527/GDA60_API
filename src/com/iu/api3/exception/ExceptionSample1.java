package com.iu.api3.exception;

import java.util.Random;

public class ExceptionSample1 {
	
	public void ex2() throws Exception { //try catch는 즉시 종료시키기 때문에 협업할 때 다른 사람이 작업을 할 수 없기 때문에 throws 권장
		//강제로 예외처리 해주는 과정
		int num1 = 65;
		int num2 = 48;
		//int sum = num1+num2;
		
		int sum = num2-num1;
		if(sum < 0) {
			throw new CustomException("음수는 읽을 수 없어용");
		}
		if(sum > 99) {
			throw new CustomException("세자리 수는 몰라용"); //메서드 선언: throws
		}
	}

	public void ex1() throws ArithmeticException, NullPointerException {
		Random random = new Random();
		int num = random.nextInt(2);
		
		num = 10/num;
		
		System.out.println(num);
	}

}
