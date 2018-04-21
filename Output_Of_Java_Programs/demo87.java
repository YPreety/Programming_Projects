package Output_Of_Java_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class demo87 {

	public static void main(String[] args) throws IOException {
		try (InputStream inputStream = new FileInputStream("C:/Users/136342/workspace/Programming_Projects/txtFile.txt")) {
			// code...
		}

	}

}