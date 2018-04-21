package Output_Of_Java_Programs;

/*int capacity( ):- Returns the capacity of the vector i.e. how many elements it can hold.
int size( ):- Returns the number of elements currently in the vector. Since no element is added, hence 0.*/

import java.util.Vector;

public class demo1 {

	public static void main(String[] args) {
		Vector v = new Vector(20);
        System.out.println(v.capacity()); //20
        System.out.println(v.size()); //0
	}
}
