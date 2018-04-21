package Output_Of_Java_Programs;

public class demo109 implements Runnable{

	public static void main(String[] args) {
		demo109 obj = new demo109();
		Thread thread1 = new Thread(obj, "Thread-1");
		thread1.start();
		thread1.start();

	}

	@Override
	public void run() {
		System.out.println("1");
	}

}
/*OUTPUT

1
Exception in thread "main" java.lang.IllegalThreadStateException
    at java.lang.Thread.start(Unknown Source) 
*/
