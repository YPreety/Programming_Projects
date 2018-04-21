package Output_Of_Java_Programs;

public class demo97 {

	public static void main(String[] args) {
		MyRunnable3 myRunnable = new MyRunnable3();
		Thread thread1 = new Thread(myRunnable, "Thread-1");
		thread1.start();

	}

}

class MyRunnable3 implements Runnable {

	public void run() {

		synchronized (this) {
			System.out.println("1 ");
			try {
				this.wait();
				System.out.println("2 ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}

/*OUTPUT

1
 
*/