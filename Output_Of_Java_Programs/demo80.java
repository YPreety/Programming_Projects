package Output_Of_Java_Programs;

public class demo80 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception handled - RuntimeException");
		} catch (ArithmeticException ae) {
			System.out.println("Exception handled - ArithmeticException");
		}

	}

}
//compilation error
//Exception is superclass of ArithmeticException. 
//Exception class handled in starting catch block must be subclass of Exception class handled in following catch blocks