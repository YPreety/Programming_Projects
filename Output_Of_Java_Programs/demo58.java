package Output_Of_Java_Programs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class demo58 {

	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
			public int compareTo(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);
		System.out.println(treeSet);
	}
}

/*OUTPUT
compile time exception
*/
/*We haven’t implemented compare method of Comparator. If compare would have been there in place of compareTo program 
would have compiled and executed properly, hence would have sorted elements of treeSet in reverse order..*/