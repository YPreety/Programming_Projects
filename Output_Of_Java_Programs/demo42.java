package Output_Of_Java_Programs;

public class demo42 {

	public static void main(String[] args) {
		Runnable[] run = new Runnable[2];
		 
        // Thread class implements Runnable interface.
        run[0] = new Thread();
        run[1] = new Thread();
        run[2] = new String(“GFG”);

	}

}

/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Type mismatch: cannot convert from String to Runnable
	Syntax error, insert "( )" to complete ClassInstanceCreationExpression
	Syntax error, insert ";" to complete Statement*/