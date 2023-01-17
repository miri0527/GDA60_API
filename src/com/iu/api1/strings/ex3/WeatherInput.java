package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	//search 메서드
	//배열을 받고, 키보드로부터 검색할 도시명을 입력 받음[대소문자무관]
	//첮운 DTO 리턴 , 없으면 null
	
	//add 메서드
	//배열을 받고, 키보드로부터 정보들을 입력 받음
	//배열에 추가하고 배열을 리턴
	
	//remove
	//배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
	//해당도시를 배열에서 삭제하고, 배열을 리턴
	Scanner scanner = new Scanner(System.in);
	
	public WeatherData search(WeatherData[] datas) {
		
		System.out.println("검색할 도시명을 입력하세요");
		String city = scanner.next().toUpperCase();
		
		WeatherData wd = new WeatherData();
		WeatherDto wdto = new WeatherDto();
		
		for(int i=0; i<datas.length; i++) {
			
		}
		
		return wd;
	}
	
	public WeatherDto[] add(WeatherDto[] weatherDtos) {
		WeatherDto weatherDto = new WeatherDto();
		System.out.println("도시명을 입력하세요");
		weatherDto.setCity(scanner.next());
		System.out.println("기온을 입력하세요");
		weatherDto.setGion(scanner.nextInt());
		System.out.println("날씨를 입력하세요");
		weatherDto.setStatus(scanner.next());
		System.out.println("미세먼지 입력하세요");
		weatherDto.setMise(scanner.nextInt());
		WeatherDto[] newInfo = new WeatherDto[weatherDtos.length + 1];
		
		for(int i=0; i<weatherDtos.length; i++) {
			newInfo[i] = weatherDtos[i];
		}
		
		newInfo[weatherDtos.length] = weatherDto;
		
		return newInfo;
		
	}
}
