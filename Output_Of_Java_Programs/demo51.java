package Output_Of_Java_Programs;

import java.util.Arrays;
import java.util.Comparator;

public class demo51 {

	public static void main(String[] args) {
		String[] ar = { "c", "d", "b", "a", "e" };
		NestedClass in = new NestedClass();
		Arrays.sort(ar, in);
		for (String str : ar)
			System.out.print(str + " ");
		System.out.println(Arrays.binarySearch(ar, "b"));

	}

	static class NestedClass implements Comparator<String> {
		public int compare(String s1, String s2) {
			return s2.compareTo(s1);
		}
	}
}

/*e d c b a -1
>compareTo() method will do the reverse sorting.
>binarySearch() gives –1 because it should have been invoked using the same Comparator as was used during 
reverse sorting of the array.*/