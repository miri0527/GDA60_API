package com.iu.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(); //순서 유지 되지않는다
		hs.add(1);
		hs.add(11);
		hs.add(11); //중복 허용 x
		hs.add(2);
		hs.remove(1); //1이라는 데이터
		
		System.out.println(hs); //toString()
		System.out.println(hs.size());
		
		//Iterator -> 또 하나의 컬렉션 (반복)-> set에 들어가있는 것을 하나씩 꺼내기 위해 반복 돌림
		//Set의 Data들을 Iterator 형식으로 변경
		//인터페이스는 객체를 선언할 수 없지만 데이터타입으로는 선언가능
		Iterator<Integer> is = hs.iterator(); 
		
		while(is.hasNext()) { //is에 다음께 더 있냐 물어보는것
			Integer num = is.next();
			System.out.println(num);
		}
	}

}
