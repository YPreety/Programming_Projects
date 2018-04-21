package Output_Of_Java_Programs;

public class demo146 extends NewTreeSet {

	public static void main(String[] args) {
		demo146 t = new demo146();
		t.count();

	}

}

protected class NewTreeSet {
	void count() {
		for (int x = 0; x < 7; x++, x++) {
			System.out.print(" " + x);
		}
	}
}
/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Illegal modifier for the class NewTreeSet; only public, abstract & final are permitted*/
//Nonnested classes cannot be marked protected (or final for that matter), 
//so the compiler will fail at protected class NewTreeSet.