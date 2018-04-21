package Output_Of_Java_Programs;

public class demo143 {

	public static void main(String[] args) {
		demo143 test = new demo143();
		test.aMethod();
		int j = test.aMethod();
		System.out.println(j);

	}

	public int aMethod() {
		static int i = 0;
		i++;
		return i;
	}

}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//Compilation failed because static was an illegal start of expression - method variables do not have a modifier 