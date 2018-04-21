package Output_Of_Java_Programs;

public class demo94 {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		System.out.println("start main() method");
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.start();
		thread2.start();
		System.out.println("end main() method");

	}

}

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("i=" + i + " ,ThreadName=" + Thread.currentThread().getName());
		}
	}
}

/*start main() method
end main() method
i=0 ,ThreadName=Thread-0
i=1 ,ThreadName=Thread-0
i=2 ,ThreadName=Thread-0
i=0 ,ThreadName=Thread-1
i=1 ,ThreadName=Thread-1
i=2 ,ThreadName=Thread-1*/