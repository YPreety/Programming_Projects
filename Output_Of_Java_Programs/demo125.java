package Output_Of_Java_Programs;

public class demo125 {

	public static void main(String[] args) {
		demo125 p = new demo125();
		p.start();

	}

	void start() {
		boolean b1 = false;
		boolean b2 = fix(b1);
		System.out.println(b1 + " " + b2); //false true
	}

	boolean fix(boolean b1) {
		b1 = true;
		return b1;
	}

}
