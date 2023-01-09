package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//순서 유지, 값의 중복 허용, 배열 기반
		int [] arr = new int[3];
		ArrayList ar = new ArrayList();
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		//add 새로운 데이터 추가
		ar.add(1); //인덱스 번호 생각 x
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==================");
		
		ar.add(1,8); //1번 인덱스에 8을 집어넣어라
		ar.remove(0);
		ar.set(2, 9); //2번 인덱스 번호를 9로 수정하라
		
		
		for(int i=0; i<ar.size(); i++) { //size = length와 동일
			System.out.println(ar.get(i)); //꺼내는 것
		}	
		
		
	}

}
