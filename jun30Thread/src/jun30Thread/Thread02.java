package jun30Thread;

import java.util.Iterator;

public class Thread02 extends Thread {
	int seq;
	public Thread02(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(this.seq + " thread started.");
		try {
			Thread.sleep(1000);//1000 millisec = 1 sec
			//정해진 시간만큼 멈춤. 예외처리 필수.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.seq + " thread ended.");
	}
	
	public static void main(String[] args) {
		System.out.println("Main started");
		for (int i = 0; i < 10; i++) {
			Thread02 t02 = new Thread02(i); 
			t02.start();
		}
		System.out.println("Main ended.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
