package com.iu.api1.strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {
	private String data;
	
	public WeatherData() {
		this.data = "SEOUL,12,맑음,60,Daegu,60,비,10," 
				+ "Jju,-56,눈,12,junju,32,흐림,5";
	}
	
	public WeatherDto [] init() {
		StringTokenizer st = new StringTokenizer(this.data, ","); 
		WeatherDto[] weathers= new WeatherDto[st.countTokens()];
		
		while(st.hasMoreTokens()) {
			WeatherDto weatherDto = new WeatherDto();
			weatherDto.setCity(st.nextToken());
			weatherDto.setGion(Integer.parseInt(st.nextToken()));
			weatherDto.setMise(Integer.parseInt(st.nextToken()));
			weatherDto.setStatus(st.nextToken());
			
		}
		return weathers;
	}
	
	//init
	//data에 있는 파싱해서 각 data를 DTO에 
	
//	public WeatherDto[] init() {
//		String datas[] = data.split(",");
//		WeatherDto[] weathers = new WeatherDto[datas.length/4]; //배열 생성
//		int idx=0;
//		for(int i=0; i<datas.length; i++) {
//			WeatherDto weatherDto = new WeatherDto();
//			weatherDto.setCity(datas[i]);
//			weatherDto.setGion(datas[++i]); //먼저 1증가하고 datas에 값을 꺼내러
//			weatherDto.setStatus(datas[++i]);
//			weatherDto.setMise(datas[++i]);
//			
//			weathers[idx] = weatherDto;
//			idx++;
//			
//		}
//		
//		return weathers;
//		
//	}
	
}
