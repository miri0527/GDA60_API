package com.iu.api1.string;

public class StringEx1 {

	public static void main(String[] args) {
		boolean check = true;
		int idx = 0;
		String phone = "010-1234-5678";
		
		while(check) {
			
			idx = phone.indexOf('-',idx);
			if(idx !=-1) {
				System.out.println("IDX: " + idx);
				idx++;
			}else {
				break;
			}
		}
		

	}

}
