package Output_Of_Java_Programs;

public class demo83 {

	public static void main(String[] args) {
		int i =1;
		if(i==1)
			throw new UserDefinedException("user defined exception");
		System.out.println("end");
	}
}
class UserDefinedException extends RuntimeException{
	UserDefinedException(String s){
		super(s);
	}
}

//Exception in thread "main" Output_Of_Java_Programs.UserDefinedException: user defined exception