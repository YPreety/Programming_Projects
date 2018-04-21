package Output_Of_Java_Programs;

public class demo139 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println("x = " + b.GetResult(0, 1));

	}

}

class A {
	final public int GetResult(int a, int b) {
		return 0;
	}
}

class B extends A {
	public int GetResult(int a, int b) {
		return 1;
	}
}
//Compilation fails.