package Output_Of_Java_Programs;

public class demo79 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (ArithmeticException ae) {
			System.out.println("Exception handled - ArithmeticException");
		} catch (RuntimeException re) {
			System.out.println("Exception handled - RuntimeException");
		} catch (Exception e) {
			System.out.println("Exception handled - Exception");
		}

	}

}
//Exception handled - ArithmeticException