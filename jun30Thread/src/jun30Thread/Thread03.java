package jun30Thread;

import java.util.ArrayList;

//join();
public class Thread03 extends Thread {
	int seq;

	public Thread03(int seq) {
		this.seq = seq;
	}

	@Override
	public void run() {
		System.out.println(this.seq + " started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(this.seq + " ended");
	}

	public static void main(String[] args) {
		System.out.println("main started");

		ArrayList<Thread> threads = new ArrayList<Thread>();

		for (int i = 0; i < 10; i++) {
			Thread03 t03 = new Thread03(i);
			t03.start();
			threads.add(t03);
		}

		for (int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("main ended");

	}

}
