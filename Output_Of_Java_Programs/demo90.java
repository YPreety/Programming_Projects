package Output_Of_Java_Programs;

import java.io.FileNotFoundException;

public class demo90 {

	public static void main(String[] args) {
		m();
        System.out.println("after calling m()");

	}
	static	void m() {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException handled in try-catch block");
		}
	}

}

/*FileNotFoundException handled in try-catch block
after calling m()*/