package com.iu.api3.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain1 {

	public static void main(String[] args) throws IOException {
		//1.키보드 연결
		//표준입력기 : 키보드, 마우스, 스캐너
		//표준출력기 : 모니터
		Scanner sc = new Scanner(System.in);
		//System.in  : 키보드와 입력
		//System.out : 화면에 출력
		
		//byte 0과1로 입력
		InputStream is= System.in;
		//Reader이라는 추상클래스를 구현
		//문자 한글자로 입력 ->char
		InputStreamReader ir = new InputStreamReader(is);
		//String
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.println("입력");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				sc.close();
			}catch(Exception e) {
				
			}
			
		}
	}

}
