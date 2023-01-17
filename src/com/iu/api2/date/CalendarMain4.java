package com.iu.api2.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

final class CalendarMain4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//2023년 1월 11일 => format
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); //대소문자 구분
		String p = sd.format(ca.getTime()); //리턴타입이기에 변수로 받아야함
		
		System.out.println(p);

	}

}
