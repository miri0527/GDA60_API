package com.iu.api5.thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1();
		ThreadTest2 tt2 = new ThreadTest2();
		ThreadTest3 tt3 = new ThreadTest3();
		ThreadTest4 tt4 = new ThreadTest4();
		
		tt1.start(); //os에게 위임
		tt2.start(); //os에게 위임
		
		//runable
		Thread tr1 = new Thread(tt3); //runable타입 집어넣기
		Thread tr2 = new Thread(tt4); //thread클래스에만 start메서드가 있기때문에 한번 더 선언
		
		tr1.start();
		tr2.start();
		
		
//		tt1.t1();
//		tt2.t2();
		

	}

}
