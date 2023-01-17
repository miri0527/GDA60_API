package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>(); //ArrayList<Integer> 데이터타입
		ars.add(ar1);
		ars.add(ar2);
		
		ars.get(0).get(0);
		
		ArrayList<ArrayList<ArrayList<Integer>>> arrs = new ArrayList<>();
		
		HashMap<String, ArrayList<Integer>> map2 = new HashMap<>();
		
		map2.put("ar1", ar1);
		map2.put("ar2", ar2);

	}

}
