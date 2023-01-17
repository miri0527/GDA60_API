package com.iu.api5.thread;

public class ThreadTest1 extends Thread {
	
	@Override
	public void run() { //os가 실행되도록 만들어놓은 것
		this.t1();
	}
	
	public void t1() {
		
		for(int i=0; i<26; i++) {
			System.out.println("T1: " + i);
			try {
				Thread.sleep(1000); //1초동안 쉬어라
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
	}

	
}
