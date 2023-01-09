package com.iu.api1.wrappers;

import java.util.Scanner;

public class ExMainMe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민등록번호 입력"); //991223-1234567
		String number = scanner.next();
		boolean check = true;
		int num1 = 0;
		int num2=0;
		
		String [] num = number.split("-");
		
		
		
		for(int i=0; i<num.length; i++) {
			if(i<6) {
				num1 = Integer.parseInt(num[i]); //99
				check = true;
			}
			
		}
		if(check == true) {
			System.out.println(num1);
		}

	}

}
