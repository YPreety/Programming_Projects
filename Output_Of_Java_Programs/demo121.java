package Output_Of_Java_Programs;

public class demo121 {

	public static void main(String[] argh) {
		int x;
		x = argh.length;
		for (int y = 1; y <= x; y++) {
			System.out.print(" " + argh[y]);
		}

	}

}
/*Explanation:

An exception is thrown because at some point in (System.out.print(" " + argh[y]);), 
the value of x will be equal to y, resulting in an attempt to access an index out of bounds for the array. 
Remember that you can access only as far as length - 1, so loop logical tests should 
use x < someArray.length as opposed to x < = someArray.length.*/