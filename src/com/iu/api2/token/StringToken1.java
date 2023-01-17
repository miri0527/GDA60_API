package com.iu.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japan,일본";
		//하나하나 독립적이면 split, 복합적인 데이터를 묶어서 프린트하려면 StringToken
		String [] n = nations.split(",");
		
		for(int i=0; i<n.length; i++) {
			NationDTO nationDTO = new NationDTO();
			nationDTO.setName(n[i]);
			nationDTO.setCity(n[++i]);
		}
		
		StringTokenizer st = new StringTokenizer(nations,","); //자른문자:토큰 
		
		while(st.hasMoreTokens()) { //토큰이 더 있습니까
			NationDTO nationDTO = new NationDTO();
			
			String t1 = st.nextToken();
			nationDTO.setName(t1);
			System.out.println(t1);
			
			String t2 = st.nextToken();
			nationDTO.setCity(t2);
			System.out.println(t2);
		}
	
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}

	}

}
