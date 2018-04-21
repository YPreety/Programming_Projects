package Output_Of_Java_Programs;

/*Explanation:
Void addElement (E) :– Element E is added to the vector
void insertElementAt(Object E, int index) :– Adds element E to the vector at the location specified by index.
Object firstElement( ) :– Returns the first element in the vector.

“Java” becomes the first element and “Geeksforgeeks” becomes 2nd element.*/

import java.util.Vector;

public class demo3 {

	public static void main(String[] args) {
		Vector v = new Vector(20);
        v.addElement("Geeksforgeeks");
        v.insertElementAt("Java", 0);
        System.out.println(v.firstElement()); //Java
	}
}
