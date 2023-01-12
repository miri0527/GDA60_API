package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		//클라이언트 접속
		//1. 점심 메뉴 중 하나를 랜덤하게 골라서 전송
		//2. 저녁 메뉴 중 하나를 랜덤하게 골라서 전송
		//3. 종료
		
		ServerSocket ss = null; //기다리는 것
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null; //내가 보내는 것
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		Random random = new Random();
		String [] lunch = {"국밥","김치찌개","분식"};
		String [] dinner = {"고기","감자탕","초밥"};
		
		try {
			ss= new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중");
			socket = ss.accept(); //소캣으로부터 응답 받음
			System.out.println("Client와 연결 성공");
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			while(true) {
				int num = Integer.parseInt(br.readLine());
				String msg = null;
				if(num == 1) {
					System.out.println("점심메뉴를 골라주세요");
					for(int i=0; i<lunch.length; i++) { //인덱스 번호를 랜덤숫자에 넣음
						int index = random.nextInt(2); //인덱스가 0 1 2 출력
						if(index == i) {
							msg = lunch[i];
						}
					}
				}else{
					System.out.println("저녁메뉴를 골라주세요");
				}
				
				bw.write(msg + "\r\n");
				bw.flush();
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
