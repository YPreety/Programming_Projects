package Output_Of_Java_Programs;

public class demo78 {

	public static void main(String[] args) {
		System.out.println("method return -> " + m()); //method return -> finally

	}

	static String m() {
		try {
			int i = 10 / 0;
		} catch (ArithmeticException e) {
			return "catch";
		} finally {
			return "finally";
		}

	}

}
