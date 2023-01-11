package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		//1000원 로또 구매 1-45 번호 6개를 랜덤하게 추출
		Random random = new Random();
		
		//1.첫번째 방법 -> 배열
		int [] nums = new int[6]; //개수가 정햐져있는 것은 배열이 편함
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = random.nextInt(45) + 1;;
			for(int j=0; j<i; j++) { //i=0->0번 i=1->1번 i=2->2번 .... 돈다
				if(nums[i] == nums[j]) {
					i--; //같아도 i문으로 넘어가면 1씩 증가하니까 i를 1씩 감소하여 같은 인덱스번호에 들어가게 만듦
					break;
				}else {
					continue;
				}
			}
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

		//2.ArrayList
		ArrayList<Integer> ar = new ArrayList<>(); 
		
		while(ar.size() < 6) { //size가 0부터 생성
			int n = random.nextInt(45)+1;
			boolean check = true;
			
			for(int i=0; i<ar.size(); i++) {
				if(n==ar.get(i)) {
					check = false; //중복 발생 -> false
					break;
				}
			}
			
			if(check) { //check가 true라면 집어넣자
				ar.add(n);
			}
		}
	
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//3.HashSet
		HashSet<Integer> hs =new HashSet<>(); //중복제거
		
		
		while(hs.size() < 6) {
			hs.add(random.nextInt(45) + 1);
		}
		System.out.println(hs);
		
		
	}

}
