package com.iu.api1.objects;

public class ObjectStudy {
	
	public static void main(String[]args) {
		//객체 생성 공식
		Object object = new Object(); //모든 클래스의 최고 부모 클래스
		
		//멤버 사용(접근)
		//참조변수명.변수명, 참조변수명.메서드명()
		int a = object.hashCode(); //리언티면 담아줘야됨
		System.out.println(a);
		
		String result = object.toString();
		System.out.println(result);
		System.out.println(object); //object.toString() 자동 호출 
		
		Child child = new Child();
		child.toString(); //child는 object 타입이기 때문에 object안에 있는 toString기능 사용 가능
		System.out.println(child.toString());
		System.out.println(child); 
		System.out.println(child.hashCode()); //메모리의 주소-> 16진수를 10진수로 변환
		
		Object obj = new Object();
		System.out.println(object == obj); //주소값 비교
		
		boolean check = object.equals(obj);
		System.out.println(check);
		
		Object o = child; //다형성
		
	}
}
