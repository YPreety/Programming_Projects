package Output_Of_Java_Programs;

import java.util.Vector;

/*Explanation: elementAt(int index) :- Returns the element at the location specified by index.
Here also, the element is added at index 0 and the size of array is only 1.
So invoking elementAt(1) raises an exception as index no. 1 is not yet existing.*/

public class demo4 {

	public static void main(String[] args) {
		Vector v = new Vector(20);
        v.addElement("Geeksforgeeks");
        System.out.println(v.elementAt(1)); // ArrayindexOutOfBound Exception
	}
}