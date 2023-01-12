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
import java.util.Scanner;

public class Server1 {
	//서버 -> 항구라고 생각하면 편함 -> client가 답이 오길 기다린고 답이 오면 출력해준다
	 public static void main(String[]args) {
		 
		 //접속 요청을 받아주는 소캣
		 ServerSocket ss= null;
		 Socket sc = null;
		 InputStream is = null;
		 InputStreamReader ir = null;
		 BufferedReader br = null;
		 
		 OutputStream os = null; //끝에 닫아줘야하기 때문에 바깥에 선언
		 OutputStreamWriter ow = null;
		 BufferedWriter bw = null;
		 Scanner scanner = new Scanner(System.in);
		 boolean check = true;
		 
		 try {
			ss = new ServerSocket(8282); //8282포트를 기다리는중
			System.out.println("Client 접속을 기다리는 중");
			sc = ss.accept(); //소캣으로부터 연결을 받아들인다
			System.out.println("Client와 연결 성공");
			
			is = sc.getInputStream(); //0과 1을 처리하는 것 -> server은 받는 것
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			while(check) {
				String msg = br.readLine();
				System.out.println("Client: " + msg);
				
				
				System.out.println("Clien로 보낼 메세지");
				msg = scanner.nextLine();
				

				if(msg.equals("q")) {
					System.out.println("종료했습니다");
					check = false;
				}
				
				os= sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw  = new BufferedWriter(ow);
				
				
				bw.write(msg + "\r\n");
				bw.flush();
				
				if(msg.toUpperCase().equals("Q")) {
					break; //서버가 보내고 종료
				}
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				ss.close();
			}catch(Exception e) {
				
			 }
		   }
	 }
}
