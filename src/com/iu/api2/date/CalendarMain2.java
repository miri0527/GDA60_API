package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		
		//birth에 내 생년월일 세팅
		birth.set(2000, 5-1, 27);
		
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE) + 1);
		
		//현재시간을 밀리세컨즈로 변환
		long n = now.getTimeInMillis();
		long s = sample.getTimeInMillis();
		
		n = s-n;
		
		n = n/(1000 * 60*60*24); //하루
		
		long b = birth.getTimeInMillis();
		b = b-n;
		
		b = b/(1000*60*60);
				
		System.out.println("n :" + n);
		System.out.println("s :" + s);
		System.out.println("b : " + b);
		
		System.out.println(now.getTime());
		System.out.println(sample.getTime());
		System.out.println(birth.getTime());
		
		
	}

}
