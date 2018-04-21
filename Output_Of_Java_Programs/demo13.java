package Output_Of_Java_Programs;

import java.util.Vector;

//Explanation: void trimToSize( ):-  Sets the vector’s capacity equal to the number of elements that it currently holds.
public class demo13 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
        v.addElement("Geeksforgeeks");
        v.addElement("Java");
        v.trimToSize();
        System.out.println(v.size()); //2
        System.out.println(v.capacity()); //2
	}
}
