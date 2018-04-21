package Output_Of_Java_Programs;

public class demo82 {

	static String str = " ";
	public static void main(String[] args) {
		try{
			str +="a";
		    throw new Exception();
		}catch(Exception e){
			str += "b";
		}finally{
			str += "c";
			method();
			str += "d";
		}
		System.out.println(str);
	}
	static void method(){
		throw new NullPointerException();
	}

}
//Exception in thread "main" java.lang.NullPointerException