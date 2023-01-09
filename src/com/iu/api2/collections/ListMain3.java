package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain3 {
	//배열은 무조건 그림 그려보기
	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다
		//Generic : Type의 안전성을 위함
		//E : 변수명 -> reference만 가능
		//E -> Integer
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		
		int num = ar.get(0); //Integer타입이기 때문에 형변환을 하지 않고도 가능
		
		ArrayList<WeatherDto> ar2 = new ArrayList<>();
		WeatherDto weatherDto = new WeatherDto(); 
		weatherDto.setCity("Seoul");
		ar2.add(weatherDto);
		weatherDto = new WeatherDto(); //주소값이 다르게 만들기때문에 객체 각자 생성
		weatherDto.setCity("Jeju");
		ar2.add(weatherDto);
		
		weatherDto = new WeatherDto();
		weatherDto.setCity("Jeju");
		
		ar2.remove(weatherDto); //주소값을 지우는 것 -> 마지막에 객체 생성된 변수를 지워준다
		
		for(int i=0; i<ar2.size(); i++) {
			System.out.println(ar2.get(i).getCity());
		}
		

	}

}
