package Output_Of_Java_Programs;

public class demo134 {

	public static void main(String[] args) {
		demo134 s = new demo134();
		s.start();

	}

	void start() {
		int a = 3;
		int b = 4;
		System.out.println(" " + 7 + 2 + " ");//72
		System.out.println(a + b);//7
		System.out.println(" " + a + b + " ");//34
		System.out.println(foo() + a + b + " ");//foo34
		System.out.println(a + b + foo());//7foo
	}

	String foo() {
		return "foo";
	}

}
