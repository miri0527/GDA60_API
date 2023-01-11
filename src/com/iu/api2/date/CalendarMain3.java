package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain3 {

	public static void main(String[] args) {
		//현재 시간
		Calendar ca = Calendar.getInstance();
		
		//3일 후
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.DATE, 30);
		
		long d = 1000*60*60*24*3;
		ca2.setTimeInMillis(ca2.getTimeInMillis() + d);
		
		//ca2.getTimeInMillis() + d;
		//ca2.set(Calendar.DATE, ca.get(Calendar.DATE) + 3);
		//ca2.add(Calendar.DATE, 3); //월까지 바뀜
		ca2.roll(Calendar.DATE, 3); //원하는 필드만 불림 -> 월은 바뀌지 않는다
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
	}

}
