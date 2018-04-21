package Output_Of_Java_Programs;

public class demo118 {

	public void main(String[] args) {
		System.out.println( "Hello" + args[0] );

	}

}
//with static :- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
//without static :- The code does not run.