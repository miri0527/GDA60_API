package com.iu.api2.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		//데이터 추가
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k2", "v2Re");
		
		//데이터 조회
		String v = map.get("k3");
		
		//순서가 없기 때문에 끼워넣거나 수정 메서드가 따로 없음
		
		//삭제
		v = map.remove("k2");
		
		//전체 삭제
		
		boolean check = map.containsKey("k1");
		check = map.containsValue("v1");
		System.out.println(check);
		
		//반복
		//1.Key들의 정보를 알아야 함
		//  Key들의 Set으로 변환
		//  Set을 Iterator로 변환
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key =it.next();
			System.out.println("Key : " + key);
			String value = map.get(key);
			System.out.println(value);
		}
		
		map.clear();
		
		System.out.println(v);
		System.out.println(map);

	}

}
