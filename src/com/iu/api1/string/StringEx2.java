package com.iu.api1.string;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] names = {"jpg","jpeg","gif","png"};
		boolean check = true;
	
			while(check) {
				System.out.println("파일명 입력");
				String fileName = scanner.next();
				int n = fileName.lastIndexOf(".");;  //.을 기준으로 자르기
			    for(int i=0; i<names.length; i++) {
			    	if(fileName.substring(n+1).equals(names[i])) {
			    		System.out.println(fileName);
			    		break;
			    	}else {
			    		System.out.println("잘못된 파일명입니다");
			    		
			    	}
			    }
			}
			
		

	}

}
