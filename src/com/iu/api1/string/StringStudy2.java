package com.iu.api1.string;

public class StringStudy2 {

	public static void main(String[] args) {
		String email = "a@bc@123@gmail.com";
		int idx = email.lastIndexOf("@");
		System.out.println(idx);
		
		System.out.println(email.length());
		
		for(int i=0; i<email.length(); i++) {
			System.out.print(email.charAt(i) + " ");
		}
		
		String str = "a";
		String str2 = " a";
		//String str3 = null; //에러
		System.out.println("\nSTR: " + str.length());
		
		System.out.println("Before Email : " + email);
		String a = email.replace("@", "_");
		System.out.println("After Email: " + a);
		
	}

}
