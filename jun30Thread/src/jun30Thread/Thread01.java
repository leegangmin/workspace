package jun30Thread;
//다중작업
//web에는 기본적으로 적용됨.

/* Thread 클래스를 상속받거나 Runnable 인터페이스를 구현해야함.
 * 실행은 run()를 start()해서 사용함.
 * 
 */
//or implements Runnable

public class Thread01 extends Thread{ 
	public void run() {
		System.out.println("Thread started");
	}

	public static void main(String[] args) {
		Thread01 t01 = new Thread01();
		t01.start();
	}
}
