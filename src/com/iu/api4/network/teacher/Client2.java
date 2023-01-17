package com.iu.api4.network.teacher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		//1. 서버 접속 시도
		//2. 1. 점심, 2. 저녁 3. 종료
		//3. 1,2,3 고르기
		//1번 : 서버에서 점심 메뉴 중 하나를 보내줌, 출력
		//2번 : 서버에서 저녁 메뉴 중 하나를 보내줌, 출력
		//3번 : 종료 
		
		Scanner scanner = new Scanner(System.in);
		
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;

		try {
			socket = new Socket("localhost", 8282); //자기 자신 또는 상대방의 ip
			is = socket.getInputStream(); //빨대꼽기
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow); 
			
			while(true) {
			System.out.println("1.점심 2.저녁 3.종료");
			int select = scanner.nextInt();
			bw.write(select + "\r\n");
			bw.flush();
			
			String menu = br.readLine(); //받은 메뉴
			System.out.println("오늘 메뉴는: " + menu);
		 	
			
			if(select == 3) {
				System.out.println("프로그램 종료");
				break;
			}
			
		  }
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
