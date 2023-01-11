package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		//GregoriaCalendar
		
		Calendar ca = new GregorianCalendar();
		//현재날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		System.out.println(ca);
		
		ca.set(Calendar.YEAR, 2032);
		ca.set(Calendar.MONDAY, 12-1); //11로 세팅
		
		
		//year
		int year = ca.get(Calendar.YEAR);
		System.out.println("Year: " + year);
		
		//month -> 0부터 시작
		int month = ca.get(Calendar.MONTH);
		System.out.println("Month: " + (month+1)); //컴퓨터는 단위를 셀 때 0부터 센다
		
		//date
		int date = ca.get(Calendar.DATE);
		System.out.println("Data: " + date);
		
		//day -> 요일 일월화수목금토
		int day = ca.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day: " + day); 
	
		//시 분 초
		int hour = ca.get(Calendar.HOUR); //+ hour of day
		int minute = ca.get(Calendar.MINUTE);
		int second = ca.get(Calendar.SECOND);
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
		
	}

}
