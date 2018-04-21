package Output_Of_Java_Programs;

import java.io.IOException;

public class demo96 {

	public static void main(String[] args) throws IOException {
		MyRunnable2 obj = new MyRunnable2();
		Thread t = new Thread(obj, "Thread-1");
		t.start();

		System.out.println("press enter");
		System.in.read();
		t.interrupt();

	}

}

class MyRunnable2 implements Runnable {

	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) {
				Thread.sleep(1000);
				System.out.println("x");
			}
		} catch (InterruptedException e) {
			System.out.println(Thread.currentThread().getName() + " ENDED");
		}
	}
}

/*
 * OUTPUT
 * 
 * press enter x x x x
 * 
 * Thread-1 ENDED
 * 
 */