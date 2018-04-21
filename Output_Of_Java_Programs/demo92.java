package Output_Of_Java_Programs;

import java.io.IOException;
import java.sql.SQLException;

public class demo92 {

	public static void main(String[] args) {
		try {
			m();
			System.out.print("a");
		} catch (Exception e) {
			System.out.print("b");
		} finally {
			System.out.print("c");
		}

	}

	static void m() throws IOException, SQLException {
		int i = 1;
		if (i == 1)
			throw new IOException();
		else
			throw new SQLException();
	}

}
//bc