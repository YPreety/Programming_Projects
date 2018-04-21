package Output_Of_Java_Programs;

public class demo66 {

	public static void main(String[] args) {
		Abc o = new Abc();
		Integer i[] = { 1, 2 };
		o.display(i);
		Double d[] = { 1.1, 2.2 };
		o.display(d);
	}
}

class Abc {
	<t> void display(t obj[]) {
		for (t i : obj) {
			System.out.print(i + "  ");  //1  2  1.1  2.2  
		}
	}
}