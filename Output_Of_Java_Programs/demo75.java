package Output_Of_Java_Programs;

public class demo75 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0; // will throw ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException handled in catch block");
		} finally {
			System.out.println("finally block executed");
		}

		System.out.println("code after try-catch-finally block");
	}
}
/*ArithmeticException handled in catch block
finally block executed
code after try-catch-finally block*/