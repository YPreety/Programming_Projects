package Output_Of_Java_Programs;

public class demo127 {

	public static void main(String[] args) {
		int x = 0x80000000;
		System.out.print(x + " and  "); //-2147483648 and  
		x = x >>> 31;
		System.out.println(x); //1

	}

}
