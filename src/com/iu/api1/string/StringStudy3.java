package com.iu.api1.string;

public class StringStudy3 {

	public static void main(String[] args) {
		//주소비교
		//String은 불변 -> 값을 변경시킬 수 없다
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1==str2);
		//heap영역에 상수구간을 따로 만들고 hello를 str1,str2에 대입 -> str1과 str2는 상수구간에 같이 있다
		System.out.println(str3==str4); // new는 새로 집어넣기 때문에 주소값이 달라서 false로 나온다
		System.out.println(str1==str3);
		
		str1 = str1 + "world" + str2; 
		//hello와 word는 상수구간 -> hello값은 불변 -> world는 새로운 구역에 만들어짐 -> 그리고 hello도 다른 구역에 만들어짐
		//때문에 결과값 str1과 전 str1은 같지않다 -> +만큼 객체 만들어짐
		

	}

}
