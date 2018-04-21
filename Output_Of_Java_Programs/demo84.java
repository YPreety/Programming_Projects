package Output_Of_Java_Programs;

import java.io.IOException;

public class demo84 {

	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (IOException | Exception ex) {
			System.out.println(ex + " handled ");
		}

	}

}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 