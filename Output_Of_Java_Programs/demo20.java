package Output_Of_Java_Programs;

//output :- Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

public class demo20 {

	public static final long GUEST_ID = -1;
	private static final long USER_ID;
	static {
		try {
			USER_ID = getID();
		} catch (IdNotFound e) {
			USER_ID = GUEST_ID;
			System.out.println("Logging in as guest");
		}
	}

	public static void main(String[] args) {
		System.out.println("User ID: " + USER_ID);

	}

	private static long getID() throws IdNotFound {
		throw new IdNotFound();
	}
}

class IdNotFound extends Exception {
	IdNotFound() {
	}
}
