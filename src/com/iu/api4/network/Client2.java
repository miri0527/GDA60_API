package com.iu.api4.network;

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
		
		Socket socket = null; //번호를 보내줘야됨
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null; //server에서 받음
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner= new Scanner(System.in);
		
		try {
			socket = new Socket("192.168.1.123", 8282);
			System.out.println("서버로 부터 접속 성공");
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(true) {
				System.out.println("1.점심 2.저녁 3.종료");
				int num = scanner.nextInt(); //번호 입력
				if(num == 3) {
					break;
				}
				
				bw.write(num + "\r\n");
				bw.flush();
				
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				String msg = br.readLine();
				System.out.println("점심 메뉴: " + msg);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
