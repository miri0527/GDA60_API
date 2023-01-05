package com.iu.api1.string;

import java.util.Comparator;
import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER); //static 클래스이기에 객체 생성 x
		
		String str1 = new String("abc"); //원래 객체 생성 방법
		String str2 = "abcd"; //지금 생성 방법
		
		System.out.println(str2==str1); //String에서 toString을 바로 오버라이딩 한 것 , 주소비교
		
		boolean check = str1.equals(str2);
		System.out.println(check); //문자열 같냐 비교
		
		char c = str1.charAt(1);
		System.out.println("CHAR: " + c);
		
		//Scanner sc = new Scanner(System.in);
		//c = sc.next().charAt(0); //문자 한글자만 받을 때
		//System.out.println(c);
		int num = str2.indexOf('d',3);
		System.out.println(str1.indexOf(c));
		System.out.println(num);
		
	}

}
