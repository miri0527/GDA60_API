package com.iu.api4.network.ex.servers;

import java.util.ArrayList;

public class ServerMain {

	public static void main(String[] args) {
		//프로그램 시작, Test
//		Server
//		  1.C:\\fileTest\\123.txt 초기화
//		->Server에서 초기화한 배열을 Client로 보내줘야됨 - .ArrayList
//		-> 배열을 다 꺼내서 String으로 보내야함
//		-> 클라이언트한테 이름 번호 이런 걸 쉼표로 구분해서 보내줌
//		   winter-60-30-50-90
//
//		Client
//		  1.전체학생정보출력-> 클라이언트 : 파싱
//		   2.학생정보검색출력 -> 이름을 입력해서 -> 앞이 2번이면 검색 2-winter
//		  3.학생정보추가 
//		  4.학생정보삭제 - .앞이 4번이면 삭제 -> 4-winter
//		  5.종료
		
		try {
			new StudentController().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
