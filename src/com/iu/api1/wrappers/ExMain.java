package com.iu.api1.wrappers;

import java.util.Scanner;

public class ExMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호 입력"); //991223-1234567
		String jumin = scanner.next();
		
//		JuminCheck check = new JuminCheck();
//		check.check1(jumin);
//		check.check2(jumin);
		
		JuminCheck2 check2 = new JuminCheck2();
		check2.check(jumin);

	}

}
