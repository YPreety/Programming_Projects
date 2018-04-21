package Output_Of_Java_Programs;

public class demo77 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException handled in catch block");
		} finally {
			System.out.println("finally block executed");
		}

		System.out.println("code after try-catch-finally block");
	}
}

/*finally block executed
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Output_Of_Java_Programs.demo77.main(demo77.java:7)*/