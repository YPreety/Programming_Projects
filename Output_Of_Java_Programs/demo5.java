package Output_Of_Java_Programs;

import java.util.Vector;

/*Explanation:
firstElement( ):- Returns the first element in the vector.
lastElement( ):- Returns the last element in the vector.*/

public class demo5 {

	public static void main(String[] args) {
		Vector v = new Vector(40);
        v.addElement("Geeksforgeeks");
        v.addElement("Programming");
        v.addElement("Java");
        System.out.println(v.firstElement()); // Geeksforgeeks
        System.out.println(v.lastElement()); // Java
	}
}
