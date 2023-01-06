package com.iu.api1.string;

import java.util.Scanner;

public class StringeEx2 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner scanner = new Scanner(System.in);
		String[] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명 입력");
		String fileName = scanner.next();
		
		//화장자 분리 작업
		int idx = fileName.lastIndexOf(".");
		String result = fileName.substring(idx+1);
		System.out.println(result);
		boolean flag = true;
		
		//확장자가 이미지인지 검증
		for(int i=0; i<names.length; i++) {
			if(result.equals(names[i])) {
				System.out.println("정상 파일이다");
				flag =!flag; //if문이 한번이라도 돌면 false
			}
		}
		
		if(flag) {
			System.out.println("비정상 파일이다");
		}
		
		//for문을 돌렸을 때는 정상이냐 아니냐를 판별
		
		System.out.println("Finish");
	}

}
