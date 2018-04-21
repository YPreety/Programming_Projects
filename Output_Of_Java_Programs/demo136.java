package Output_Of_Java_Programs;

class Two {
	byte x;
}

public class demo136 {

	public static void main(String[] args) {
		demo136 p = new demo136();
		p.start();

	}

	void start() {
		Two t = new Two();
		System.out.println(t.x + " ");//0
		Two t2 = fix(t);
		System.out.println(t.x + " " + t2.x);//42 42
	}

	Two fix(Two tt) {
		tt.x = 42;
		return tt;
	}

}
