package com.iu.api3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {

	public static void main(String[] args) {
		File file = new File("C:\\fileTest","test.txt");
		System.out.println(file.exists());
		
		//파일에 내용을 작성
		String name = "IU"; //메모장에서 바로 보여지는게 아니라 buffer에 담아서 꺼내서 보여짐
		try {
			FileWriter fw = new FileWriter(file,true); //append가 true면 계속 작성
			fw.write(name + "\r\n"); //\r -> 갔다가 뒤로 땡기기 \n은 enter
			fw.flush(); //-> buffer가 비워지지않으면 밀어내지 않기에 강제로 버퍼 밀기
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
