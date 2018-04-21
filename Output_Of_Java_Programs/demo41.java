package Output_Of_Java_Programs;

public class demo41 {

	public static void main(String[] args) {
		Number[][] arr = new Number[2][2];
        arr[0][0] = 10l;
 
        // Assigning char to Number type array
        arr[0][1] = 'a';
        byte b = 10;
        arr[1][0] = b;
 
        // Assigning String to Number type array
        arr[1][1] = "GEEKS";

	}

}

/*Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Type mismatch: cannot convert from char to Number
	Type mismatch: cannot convert from String to Number*/