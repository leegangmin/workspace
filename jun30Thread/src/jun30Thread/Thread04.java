package jun30Thread;

import java.util.ArrayList;

//interface로 Runnable
public class Thread04 implements Runnable {
	int seq;

	public Thread04(int seq) {
		this.seq = seq;

	}

	@Override
	public void run() {
		System.out.println(this.seq + " thread started.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(this.seq + " thread ended.");
	}

	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Thread04(i));
			// Thread의 생성자로 Runnable을 구현한 객체를 넘김.
			t.start();
			threads.add(t);

		}

		for (int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);

			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main method ended.");
	}
	
}
