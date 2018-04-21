package Output_Of_Java_Programs;

interface Count {
	short counter = 0;

	void countUp();
}

public class demo144 implements Count {

	public static void main(String[] args) {
		demo144 t = new demo144();
		t.countUp();

	}

	public void countUp() {
		for (int x = 6; x > counter; x--, ++counter) /* Line 14 */
		{
			System.out.print(" " + counter);
		}
	}

}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//The code will not compile because the variable counter is an interface variable that is by default final static. 