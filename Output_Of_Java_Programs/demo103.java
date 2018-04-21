package Output_Of_Java_Programs;

public class demo103 {

	public static void main(String[] args) {
		MyRunnable8 runnable = new MyRunnable8();
		Thread thread1 = new Thread(runnable, "Thread-1");
		Thread thread2 = new Thread(runnable, "Thread-2");
		thread1.start();
		thread2.start();

	}

}

class MyRunnable8 implements Runnable {
	public void run() {
		method();
	}

	synchronized void method() {
		for (int i = 0; i < 2; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

/*OUTPUT if Thread-1 entered first in synchronized block.

Thread-1
Thread-1
Thread-2
Thread-2
 
*/


/*OUTPUT if Thread-2 entered first in synchronized block.
 
Thread-2
Thread-2
Thread-1
Thread-1
 
*/