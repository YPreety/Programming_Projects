package Output_Of_Java_Programs;

import java.io.FileNotFoundException;

public class demo91 {

	public static void main(String[] args) {
		try {
			m();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException handled in try-catch block");
		}
		System.out.println("after calling m()");
	}
	static void m() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

}
/*FileNotFoundException handled in try-catch block
after calling m()*/
