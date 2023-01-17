package com.iu.api3.io;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
		//1. java.io.File 클래스
		//   HDD에 파일과 폴더의 정보를 담으려고 하는 클래스
		
		//File file = new File("C:\\fileTest\\ex3\\t1"); //파일의 경로 
		File file = new File("C:\\");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length()); //파일의 크기
		System.out.println(file.exists()); //지정 파일이 있습니가?
		file.mkdir(); //부모폴더가 없으면 그 안에 있는 파일이 만들어지지않음
		file.mkdirs(); //복수형
		
		if(!file.exists()) {
			file.mkdirs();
		}
		  String[] files = file.list();
		  for (String name : files) {
			System.out.println(name);
			File f = new File("C:\\" + name); //C밑에 있기 때문에 이렇게 생성해야됨 -> 절대경로 
			//File f = new File(file,name) 이것도 가능
			System.out.println(f.isDirectory());
		  }
		  
		  File [] fs = file.listFiles(); //리턴 : 파일 배열
		//file.delete();
	}

}
