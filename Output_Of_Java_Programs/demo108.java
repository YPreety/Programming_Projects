package Output_Of_Java_Programs;

public class demo108 {

	public static void main(String[] args) {
		MyRunnable10 myRunnable = new MyRunnable10();
		Thread thread1 = new Thread(myRunnable, "Thread-1");
		thread1.start();

	}

}

class MyRunnable10 implements Runnable {

	public void run() {

		System.out.println("1 ");
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("2 ");

	}
}

/*OUTPUT

1
Exception in thread "Thread-1" java.lang.IllegalMonitorStateException
    at java.lang.Object.wait(Native Method)
    at java.lang.Object.wait(Object.java:503)
    at o15_wait_IllegalMoni.MyRunnable.run(WaitNoParaMethod.java:9)
    at java.lang.Thread.run(Unknown Source)
 
 
*/