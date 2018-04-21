package Output_Of_Java_Programs;

/*OUTPUT
1 2
*/
public class demo99 {

	public static void main(String[] args) {
		MyRunnable4 myRunnable = new MyRunnable4();
		Thread thread1 = new Thread(myRunnable, "Thread-1");
		thread1.start();

	}

}

class MyRunnable4 implements Runnable {

	public void run() {
		synchronized (this) {
			System.out.print("1 ");
			try {
				this.wait(1000);
				System.out.print("2");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}