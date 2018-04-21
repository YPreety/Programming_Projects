package Output_Of_Java_Programs;

public class demo27 {

	public static void main(String[] args) {
		S t = new S();
		t.run(1);

	}

}

class S extends Thread {
	public void run() {
		System.out.println("GeeksforGeeks");
	}

	public void run(int i) {
		System.out.println("Bishal"); //Bishal
	}
}
