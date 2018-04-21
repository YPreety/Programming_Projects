package Output_Of_Java_Programs;

public class demo126 {

	public static void main(String[] args) {
		demo126 p = new demo126();
		p.start();

	}

	void start() {
		String s1 = "slip";
		String s2 = fix(s1);
		System.out.println(s1 + " " + s2);// slip stream
	}

	String fix(String s1) {
		s1 = s1 + "stream";
		System.out.print(s1 + " ");//slipstream
		return "stream";
	}

}
