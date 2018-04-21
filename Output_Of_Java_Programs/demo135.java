package Output_Of_Java_Programs;

public class demo135 {

	static int s;

	public static void main(String[] args) {
		demo135 p = new demo135();
		p.start();
		System.out.println(s);//7

	}

	void start() {
		int x = 7;
		twice(x);
		System.out.println(x + " ");//14
	}

	void twice(int x) {
		x = x * 2;
		s = x;
	}

}
