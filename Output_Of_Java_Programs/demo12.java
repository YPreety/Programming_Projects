package Output_Of_Java_Programs;

import java.util.Vector;

/*Explanation:
void removeAllElements( ):- Empties the vector and remove all the elements of vector. After this method executes, 
the size of the vector is zero.
void removeElementAt(int index):- Removes the element at the location specified by ‘index’.*/

public class demo12 {

	public static void main(String[] args) {
		Vector v = new Vector(30);
		v.addElement("Geeksforgeeks");
		v.insertElementAt("Java", 0);
		v.removeAllElements();
		System.out.println(v.size()); //0

		v.addElement("Geeksforgeeks");
		v.addElement("Java");
		v.removeElementAt(0);
		System.out.println(v.size()); //1
	}
}
