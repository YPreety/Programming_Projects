package Output_Of_Java_Programs;

public class demo142 extends Super {

	public demo142(String text)  {
        i = 2; 
    }
	public static void main(String[] args) {
		demo142 sub = new demo142("Hello");
		System.out.println(sub.i);

	}
}

class Super {
	public int i = 0;

	public Super(String text) /* Line 4 */
	{
		i = 1;
	}
}
//Compilation fails.
/*A default no-args constructor is not created because there is a constructor supplied that has an argument, line 4. 
Therefore the sub-class constructor must explicitly make a call to the super class constructor:*/