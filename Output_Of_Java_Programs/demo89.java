package Output_Of_Java_Programs;

import java.io.FileNotFoundException;

public class demo89 {

	public static void main(String[] args) {
		m();
		System.out.println("after calling m()");

	}

	static void m() {
		throw new FileNotFoundException();
	}

}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 