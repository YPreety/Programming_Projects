package Output_Of_Java_Programs;

/*OUTPUT

1 3
 
*/
public class demo102 {

	public static void main(String[] args) {
		Thread thread1 = new MyThread() {
			public void run() {
				System.out.print("3 ");
			}
		};
		thread1.start();

	}

}

class MyThread extends Thread {
	MyThread() {
		System.out.print("1 ");
	}

	public void run() {
		System.out.print("2 ");
	}

}