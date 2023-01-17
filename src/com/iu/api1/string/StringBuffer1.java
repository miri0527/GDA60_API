package com.iu.api1.string;

public class StringBuffer1 {

	public static void main(String[] args) {
		//StringBuffer->String이 아니다
		StringBuffer sb = new StringBuffer("Hello"); //hello
		
		//hello+world
		sb.append("world");
		
		System.out.println(sb);
		
		//참조변수를 출력하면 toString() : 클래스@객체주소
		//toString을 오버라이딩 했다
		//변수에는 같은 데이터타입만 대입 가능
		//String str = sb; ->str은 String타입, sb는 StringBuffer타입 -> 대입 불가능
		String str = sb.substring(0);
		
		str = sb.toString(); 
		System.out.println(str);
		
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
