package Output_Of_Java_Programs;

public class demo115 {

	public static void main(String[] args) {
		System.out.println("1 ");
		InnerClass i = new InnerClass();
		i.start();
		System.out.println("2 ");

	}

	static class InnerClass extends Thread {
		public void run() throws RuntimeException {
			throw new RuntimeException();
		}
	}

}
/*OUTPUT

Exception in thread "Thread-0"  1
2
Exception in thread "Thread-0" java.lang.RuntimeException
    at o22.s$InnerClass.run(s.java:13)
 
*/