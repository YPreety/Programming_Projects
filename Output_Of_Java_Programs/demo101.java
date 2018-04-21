package Output_Of_Java_Programs;

/*OUTPUT

1 2 3 4
 
*/
public class demo101 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable6 myRunnable1 = new MyRunnable6();
		MyRunnable7 myRunnable2 = new MyRunnable7(myRunnable1);

		Thread thread1 = new Thread(myRunnable1, "Thread-1");
		Thread thread2 = new Thread(myRunnable2, "Thread-2");

		thread2.start();
		Thread.sleep(100); // This minor delay will ensure that Thread-1 thread
							// starts Thread-2
		thread1.start();

	}

}

class MyRunnable6 implements Runnable {

	@Override
	public void run() {

		synchronized (this) {
			try {
				System.out.print("2 ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			this.notify();

			System.out.print("3 ");

		}
	}

}

class MyRunnable7 extends Thread {
	MyRunnable6 prod;

	MyRunnable7(MyRunnable6 obj) {
		prod = obj;
	}

	public void run() {
		synchronized (this.prod) {

			System.out.print("1 ");
			try {
				this.prod.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		System.out.print("4 ");

	}

}