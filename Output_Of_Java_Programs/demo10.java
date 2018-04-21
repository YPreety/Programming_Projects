package Output_Of_Java_Programs;

import java.util.Vector;

/*Explanation:
boolean contains(Object E) Returns ‘true’ if element E is contained by the vector, and returns false if it is not.*/

public class demo10 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
        v.addElement("Geeksforgeeks");
        Vector v1 = new Vector();
        v1 = (Vector)v.clone();
        v.insertElementAt("Java", 0);
        System.out.println(v1.contains("Java")); // false
	}
}
