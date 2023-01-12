package com.iu.api4.network.teacher;

import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		//클라이언트 접속
		//1. 점심 메뉴 중 하나를 랜덤하게 골라서 전송
		//2. 저녁 메뉴 중 하나를 랜덤하게 골라서 전송
		//3. 종료
		
		Calendar ca = Calendar.getInstance();
		Random random = new Random(ca.getTimeInMillis());
		String [] lunch = {"라면","햄버거","짜장면","짬뽕"};
		//

	}

}
