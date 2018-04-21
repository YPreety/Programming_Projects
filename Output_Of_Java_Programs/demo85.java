package Output_Of_Java_Programs;

public class demo85 {

	public static void main(String[] args) {
		method1();
		System.out.println("after calling m()");

	}

	static void method1() {
		method2();
	}

	static void method2() {
		method3();
	}

	static void method3() {
		throw new NullPointerException();
	}

}

/*Exception in thread "main" java.lang.NullPointerException
at Output_Of_Java_Programs.demo85.method3(demo85.java:20)
at Output_Of_Java_Programs.demo85.method2(demo85.java:16)
at Output_Of_Java_Programs.demo85.method1(demo85.java:12)
at Output_Of_Java_Programs.demo85.main(demo85.java:6)*/
