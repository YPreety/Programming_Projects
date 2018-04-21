package Output_Of_Java_Programs;

public class demo47 {

	final static String company = "GFG";
	String name;
	int rollno;

	public static void main(String[] args) {
		demo47 ob = new demo47();
		ob.company = "Geeksforgeeks";

		ob.name = "Bishal";
		ob.rollno = 007;
		System.out.println(ob.company);
		System.out.println(ob.name);
		System.out.println(ob.rollno);

	}

}

/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final field demo47.company cannot be assigned*/