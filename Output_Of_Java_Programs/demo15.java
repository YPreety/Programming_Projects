package Output_Of_Java_Programs;

import java.util.Vector;

//Explanation: toString( ):-  Returns the string equivalent of the vector.

public class demo15 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
        v.addElement("Geeksforgeeks");
        v.addElement("Java");
        v.addElement("C++");
        v.addElement("C");
        System.out.println(v.toString()); //[Geeksforgeeks, Java, C++, C]
        v.removeAllElements();
        System.out.println(v.toString()); //[]
	}
}
