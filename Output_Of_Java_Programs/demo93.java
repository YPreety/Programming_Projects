package Output_Of_Java_Programs;

public class demo93 {

	public static void main(String[] args) {
		SuperClass obj = new SubClass();
		obj.method();

	}

}

class SuperClass {
	void method() throws NullPointerException {
		System.out.println("superClass method");
	}
}

class SubClass extends SuperClass {
	void method() throws RuntimeException {
		System.out.println("SubClass method"); //SubClass method
	}
}