package Output_Of_Java_Programs;

/*Output: ArrayindexOutOfBound Exception
Explanation: This is because initially there was only one element at index 0. 
Next it expects a value to be added at index 1, but we are adding at index 2. Hence an exception is raised.*/

import java.util.Vector;

public class demo2 {

	public static void main(String[] args) {
		Vector v = new Vector(20);
        v.addElement("Geeksforgeeks");
        v.insertElementAt("Java", 2);
        System.out.println(v.firstElement()); //ArrayindexOutOfBound Exception
	}
}
