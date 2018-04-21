package Output_Of_Java_Programs;

public class demo72 {

	public static void main(String[] args) {
		m(); // call recursive method m()
		System.out.println("Code after exception handling");

	}

	static void m() {
		try {
			m();
		} catch (StackOverflowError e) {
			e.printStackTrace();
		}
	}

}

//java.lang.StackOverflowError
/*Exception in thread "main" 
Exception: java.lang.NoClassDefFoundError thrown from the UncaughtExceptionHandler in thread "main*/
//Code after exception handling