package com.iu.api5.thread;

public class ThreadTest3 implements Runnable {
	
	@Override
	public void run() {
		this.t3();
		
	}
	
	private synchronized void t3() { 
		//무언가가 결제를 할 때 결제창은 thread->만약 누군가가 결제를 했다면 synchroinized를 걸어서 한사람만 다른 누군가는 그 결제탕에 들어오지못하게 막음 
		for(int i=0; i<25; i++) {
			System.out.println("Hello : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
