package Output_Of_Java_Programs;

public class demo106 implements Runnable{

	Class2 obj2;

	public static void main(String[] args) {
		new demo106().method1();

	}

	void method1() {
		obj2 = new Class2();
		new Thread(new demo106()).start();
		new Thread(new demo106()).start();
	}

	public void run() {
		obj2.method2(Thread.currentThread().getName());
	}

}

class Class2 {
	void method2(String name) {
		for (int x = 1; x <= 2; x++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

/*OUTPUT

Thread-1
Thread-1
Thread-0
Thread-0
 
*/
 
/*OUTPUT
 
Thread-0
Thread-1
Thread-1
Thread-0
 
*/