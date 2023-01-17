package com.iu.api1.strings.ex3;

public class WeatherView {
	
	//2개의 메서드 생성
	
	//1.모든 날씨 정보를 출력 -> WeatherDto 배열
	
	//2.DTO 하나의 정보를 출력 
	
	public void view(WeatherDto[] datas) {
		for(int i=0; i<datas.length; i++) {
			this.view(datas[i]);
		}
	}
	
	public void view(WeatherDto weatherDto) {
			System.out.println("---------");
			System.out.println("City : " + weatherDto.getCity());
			System.out.println("Gion : " + weatherDto.getGion());
			System.out.println("Status : " + weatherDto.getStatus());
			System.out.println("Mise : " + weatherDto.getMise());
		}
	
}
