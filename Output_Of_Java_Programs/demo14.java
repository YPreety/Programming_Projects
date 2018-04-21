package Output_Of_Java_Programs;

import java.util.Vector;

/*Explanation:
v.trimToSize() makes the size and capacity equal to 2.
After adding another element, the size becomes 3 and capacity gets doubled (by default) i.e. 4*/

public class demo14 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
        v.addElement("Geeksforgeeks");
        v.addElement("Java");
        v.trimToSize();
 
        v.addElement("C++");
        System.out.println(v.size());
        System.out.println(v.capacity());
	}
}
