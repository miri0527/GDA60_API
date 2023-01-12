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

public class Client1 {

	public static void main(String[] args) {
		//클라이언트는 서버로 가는 역할을 해준다
		
		//자바에서는 ip,port가 socket
		Socket socket = null;
		OutputStream os = null; //끝에 닫아줘야하기 때문에 바깥에 선언
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		
		//socket = new Socket("192.168.1.84", 0); //자기 컴퓨터 IP
		//socket = new Socket("localhost") 무조건 자기 컴퓨터
		
			
			try {
				//객체 생성 시 서버 접속 시도
				socket = new Socket("localhost",8282); //무조건 자기 컴퓨터 -> 0~65535
				System.out.println("Server 접속 성공");
				
				
				//0과 1을 바꿔주는 것
				os = socket.getOutputStream(); //빨대
				//char로 바꿔주는 것
				ow = new OutputStreamWriter(os);
				//Stream -> 읽는 것이 아니라 내보내는 것
				bw = new BufferedWriter(ow);
				
				while(check) {
					System.out.println("서버로 보낼 메세지 입력");
					String msg = scanner.next();
					
					
					bw.write(msg + "\r\n");
					bw.flush();
					
					if(msg.toUpperCase().equals("Q")) {
						System.out.println("종료되었습니다");
						check = false;
					}
					
					
					is = socket.getInputStream();
					ir = new InputStreamReader(is);
					br = new BufferedReader(ir);
					
					
					msg = br.readLine();
					
					if(msg.toUpperCase().equals("Q")) {
						break;
					}
					System.out.println("Server : " + msg);
					
				}
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally {
				try {
					br.close();
					ir.close();
					is.close();
					bw.close();
					ow.close();
					os.close();
					socket.close();
				}catch(Exception e) {
					
				}
		   }
	}

}
