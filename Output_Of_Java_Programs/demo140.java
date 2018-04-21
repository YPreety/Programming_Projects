package Output_Of_Java_Programs;

public class demo140 {

	public static void main(String[] args) {
		class Foo {
			public int i = 3;
		}
		Object o = (Object) new Foo();
		Foo foo = (Foo) o;
		System.out.println("i = " + foo.i); //i = 3

	}

}
