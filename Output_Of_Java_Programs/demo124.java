package Output_Of_Java_Programs;

public class demo124 {

	public static void main(String[] args) {
		demo124 p = new demo124();
		p.start();

	}

	void start() {
		long[] a1 = { 3, 4, 5 };
		long[] a2 = fix(a1);
		System.out.print(a1[0] + a1[1] + a1[2] + " "); //15
		System.out.println(a2[0] + a2[1] + a2[2]); //15
	}

	long[] fix(long[] a3) {
		a3[1] = 7;
		return a3;
	}

}
