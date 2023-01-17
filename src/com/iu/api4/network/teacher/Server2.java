package com.iu.api4.network.teacher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		//클라이언트 접속
		//1. 점심 메뉴 중 하나를 랜덤하게 골라서 전송
		//2. 저녁 메뉴 중 하나를 랜덤하게 골라서 전송
		//3. 종료
		String [] lunch = {"라면","햄버거","짜장면","짬뽕","굶기"};
		String [] dinner = {"삼겹살","갈비","순두부","김밥", "바나나"};
		boolean check = true;
		ServerSocket ss = null;
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(8282);
			socket = ss.accept(); //client가 server에 들어올때 ip 주소를 받아들인다 -> server는 client 주소를 모르기때문
			
			is = socket.getInputStream(); //빨대꼽기
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow); 
			 //네트워크로 받은 데이터 타입은 무조건 스트링
			
			while(true) {
			String data = br.readLine();
			
			int select = Integer.parseInt(data);
			
			Calendar ca = Calendar.getInstance(); //시간은 계속 변하니까 시드안에 시간을 넣어줘서 랜덤패턴이 일정하지 않게 넣어주는 것
			Random random = new Random(ca.getTimeInMillis()); //야기에 반복해도되고 여기에 1번만 선택해도 된다
			
			String menu = null;
			
			switch(select) {
			case 1:
				select = random.nextInt(100) % 5; //확률 편차가 줄어줄 수 있다
				menu = lunch[select];
				break;
			case 2:
				select = random.nextInt(100) % 5;
				menu = dinner[select];
				break;
			default:
				System.out.println("서버 프로그램 종료 합니다");
				check = false;
			}
			
			if(check) {
				bw.write(menu + "\r\n");
				bw.flush();
			}
			
		}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
