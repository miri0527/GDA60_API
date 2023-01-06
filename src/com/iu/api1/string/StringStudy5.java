package com.iu.api1.string;

public class StringStudy5 {

	public static void main(String[] args) {
		String str = "1. 2# 3.4, 5.2#60";
		String str2 = "apple# Apple, aPPle# apple"; //toUpperCase-> 대문자 toLowerCase -> 소문자
		str = str.replace("," ,"#"); //데이터를 #으로 바꾸기
		str2 = str2.replace(",", "#");
		
		//str = str.replace(" ", ""); //중간 공백 -> replace
		
		String[] result = str.split("#"); //하나의 문자를 여러개로 나누는 법: 파싱
		String[] result2 = str2.split("#");
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i].trim()); //trim() 앞 뒤 공백 제거
		}
		for(int i=0; i<result2.length; i++) {
			System.out.println(result2[i].trim().toUpperCase());
		}
	}

}
