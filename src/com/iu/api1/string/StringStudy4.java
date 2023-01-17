package com.iu.api1.string;

public class StringStudy4 {

	public static void main(String[] args) {
		String str = "StarWars";
		
		String result = str.substring(4); //끝을 안넣으면 끝까지 짤라옴
		System.out.println(result);
		
		result = str.substring(4, 5); //4번 부터 5번 미만까지 출력
		System.out.println(result);
		
		result = str.substring(4, 6);
		System.out.println(result);
		
		str = "tesst@naver.com";
		
		result = str.substring(str.indexOf("@") + 1);
		System.out.println(result);
	}

}
