package Output_Of_Java_Programs;

import java.util.Arrays;
import java.util.Comparator;

public class demo57 {

	public static void main(String[] args) {
		Integer intArray[] = { 2, 3, 1 };
		Arrays.sort(intArray, new Sort());
		for (int i : intArray) {
			System.out.print(i + " "); //3 2 1 
		}

	}

}

class Sort implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
}