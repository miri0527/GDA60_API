package com.iu.api3.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileMain3 {

	public static void main(String[] args) {
		File file = new File("C:\\filetest","test.txt");
		
		try {
			FileReader fr = new FileReader(file);
			//보조스트림
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String name = br.readLine();
				if(name == null) { //null -> 더 이상 내려 가지가 않아야되는데 커서가 깜빡꺼리면 null이 아니다
					break;
				}
				System.out.println(name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
