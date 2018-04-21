package Output_Of_Java_Programs;

//Java Function/Constructor Overloading Puzzle
public class demo28 {

	public static void main(String[] args) {
		new demo28(null);

	}

	private demo28(Object o) {
		System.out.println("Object");
	}

	private demo28(double[] d) {
		System.out.println("double array"); // double array

	}

}
