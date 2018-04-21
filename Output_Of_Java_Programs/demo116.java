package Output_Of_Java_Programs;

public class demo116 {

	public static void main(String[] args) {
		String[][] argCopy = new String[2][2];
		int x;
		argCopy[0] = args;
		x = argCopy[0].length;
		for (int y = 0; y < x; y++) {
			System.out.print(" " + argCopy[0][y]);//1 2 3
		}

	}

}
