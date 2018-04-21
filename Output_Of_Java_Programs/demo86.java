package Output_Of_Java_Programs;

import java.io.FileNotFoundException;

public class demo86 {

	public static void main(String[] args) throws FileNotFoundException {
		method1();
		System.out.println("after calling m()");

	}

	static void method1() throws FileNotFoundException {
		method2();
	}

	static void method2() throws FileNotFoundException {
		method3();
	}

	static void method3() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

}

/*Exception in thread "main" java.io.FileNotFoundException
at Output_Of_Java_Programs.demo86.method3(demo86.java:22)
at Output_Of_Java_Programs.demo86.method2(demo86.java:18)
at Output_Of_Java_Programs.demo86.method1(demo86.java:14)
at Output_Of_Java_Programs.demo86.main(demo86.java:8)*/

