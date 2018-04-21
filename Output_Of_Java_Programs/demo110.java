package Output_Of_Java_Programs;

public class demo110 extends Thread {

	public static void main(String[] args) {
		Thread thread1 = new MyThread();
		thread1.start();

	}

}
/*Nothing will be printed in output.

When we call start() method on thread, it internally calls run() method with newly created thread. 
So, if we don’t override run() method newly created thread won’t be called and nothing will happen.*/