package com.iu.api1.string;

import java.util.Scanner;

public class StringExMy {

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
			    		check =!check; //check =false; false가 되어버리기에 for문 빠져나옴
			    	}
			    }
			    
			    if(check) {
			    	System.out.println("비정상입니다"); 
			    	//다 반복 돌리고 없으면 check가 true이기 때문에 이 if문으로 들어온다
			    }
			}
	}

}
