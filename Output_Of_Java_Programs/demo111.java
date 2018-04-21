package Output_Of_Java_Programs;

public class demo111 {

	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.start();

	}

}

class MyThread1 extends Thread {

	public void run() {
		System.out.println("1");
	}

	public void start() {
		System.out.println("2");
	}

}
/*OUTPUT

2
 When we call start() method on thread, it internally calls run() method with newly created thread. 
 So, if we override start() method, run() method will not be called until we write code for calling run() method.
*/