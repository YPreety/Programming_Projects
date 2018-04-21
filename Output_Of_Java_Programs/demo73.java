package Output_Of_Java_Programs;

public class demo73 {

	public static void main(String[] args) {
		int i=10/0;  
        System.out.println("Did this line execute?");

	}

}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
at Output_Of_Java_Programs.demo73.main(demo73.java:6)*/