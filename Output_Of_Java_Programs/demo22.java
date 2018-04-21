package Output_Of_Java_Programs;

public class demo22 {

	public static void main(String[] args) {
		System.out.println(MyTest.getSum()); //9900
	}
}

class MyTest {
	static {
		initialize();
	}

	private static int sum;

	public static int getSum() {
		initialize();
		return sum;
	}

	private static boolean initialized = false;

	private static void initialize() {
		if (!initialized) {
			for (int i = 0; i < 100; i++)
				sum += i;
			initialized = true;
		}
	}
}