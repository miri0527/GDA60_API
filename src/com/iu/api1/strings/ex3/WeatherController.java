package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherController {
	//start
	//1.날씨정보초기화 -> 초기화가 완료 되었습니다
	//2.전국날씨정보
	//3.지역날씨검색 -> Input 정보가 있는 DTO, 또는 null -> 도시정보가 없습니다
	//4.지역날씨추가 -> Input
	//5.지역날씨삭제 -> Input
	//6.종     료
	
	private Scanner scanner;
	private boolean check = true;
	private WeatherInput wi;
	private WeatherView wv;
	private WeatherData wd;
	private WeatherDto[] wdto;
	
	public WeatherController() {
		this.scanner = new Scanner(System.in);
		this.wd = new WeatherData(); 
		this.wv = new WeatherView();
		this.wi = new WeatherInput();
		this.wdto = null;
	}
	
	public void start() {
		
		while(check) {
			System.out.println("1.날씨정보초기화");
			System.out.println("2.전국날씨정보");
			System.out.println("3.지역날씨검색");
			System.out.println("4.지역날씨추가");
			System.out.println("5.지역날씨삭제");
			System.out.println("6.종료");
			
			int num = scanner.nextInt();
			
			if(num == 1) {
				wdto= wd.init();
				System.out.println("초기화가 완료 되었습니다");
			}else if(num == 2) {
				wv.view(wdto);
			}else if(num == 4) {
				this.wdto = wi.add(wdto);
			}
			
			
		}
	}
}
