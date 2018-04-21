package Output_Of_Java_Programs;

import java.util.Vector;

/*Explanation:
void copyInto(Object array[ ]) copies The elements contained in the invoking vector into the array specified by ‘array’.
Now the array has only 2 elements “Java” and “Geeksforgeeks”, the rest of the outputs are null.*/

public class demo11 {

	public static void main(String[] args) {
		Vector v = new Vector(8);
		v.addElement("Geeksforgeeks");
		v.insertElementAt("Java", 0);
		String array[] = new String[8];
		v.copyInto(array);

		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}

/*Output :
	Java
	Geeksforgeeks
	null
	null
	null
	null
	null
	null*/