package Output_Of_Java_Programs;

public class demo113 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable12 object1 = new MyRunnable12();
		MyRunnable12 object2 = new MyRunnable12();

		Thread thread1 = new Thread(object1, "Thread-1");
		Thread thread2 = new Thread(object2, "Thread-2");
		thread1.start();
		Thread.sleep(10);// Just to ensure Thread-1 starts before Thread-2
		thread2.start();

	}

}

class MyRunnable12 implements Runnable {

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-1"))
			method1();
		else
			method2();
	}

	synchronized void method1() {
		System.out.println(Thread.currentThread().getName() + " in synchronized void method1() started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method1() ended");
	}

	synchronized void method2() {
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() started");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " in synchronized void method2() ended");
	}

}

/*OUTPUT

Thread-1 in synchronized void method1() started
Thread-2 in synchronized void method2() started
Thread-1 in synchronized void method1() ended
Thread-2 in synchronized void method2() ended
 
*/