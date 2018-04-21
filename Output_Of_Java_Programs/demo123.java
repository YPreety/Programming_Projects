package Output_Of_Java_Programs;

public class demo123 {

	public static void main(String[] args) {
		String names[] = new String[5];
		for (int x = 0; x < args.length; x++)
			names[x] = args[x];
		System.out.println(names[2]);

	}

}
//null
/*Explanation:

The names array is initialized with five null elements. 
Then elements 0 and 1 are assigned the String values "a" and "b" respectively (the command-line arguments passed to main). 
Elements of names array 2, 3, and 4 remain unassigned, so they have a value of null.*/