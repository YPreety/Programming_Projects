package Output_Of_Java_Programs;

public class demo21 {

	public static final long GUEST_ID = -1;
	private static final long USER_ID = getUserIdOrGuest();

	private static long getUserIdOrGuest() {
		try {
			return getID();
		} catch (IdNotFound e) {
			System.out.println("Logging in as guest");
			return GUEST_ID;
		}
	}

	private static long getID() throws IdNotFound {
		throw new IdNotFound();
	}

	public static void main(String[] args) {
		System.out.println("User ID: " + USER_ID);

	}

}
