package Output_Of_Java_Programs;

public class demo105 {

	public static void main(String[] args) throws InterruptedException {
		synchronized (args) {
			System.out.print("1 ");
			args.wait();
			System.out.print("2 ");
		}

	}

}
/*
 * OUTPUT
 * 
 * 1
 * 
 */