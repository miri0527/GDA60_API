package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int[] arr= new int[3];
		ArrayList ar = new ArrayList(); //모든타입을 다 담을 수 있다
		//다형성
		ar.add(1); //Auto-Boxing -> int가 Integer로 자동으로 바뀜
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
		int n1 = (Integer)ar.get(0); //UnBoxing
		double n2 = (Double)ar.get(1);
		
//		int n1 = ar.get(0);
//		double n2 = ar.get(1); 에러 -> Object타입을 받을 수 있지만 모든 Object타입이 int타입은 아니기 때문
//		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		

	}

}
