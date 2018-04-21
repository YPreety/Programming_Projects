package Output_Of_Java_Programs;

public class demo74 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception handled  properly in catch block");
		}
		System.out.println("Code after exception handling");
	}
}
/*Exception handled  properly in catch block
Code after exception handling*/