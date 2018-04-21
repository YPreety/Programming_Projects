package Output_Of_Java_Programs;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class demo60 {

	public static void main(String[] args) {
		Collection<Integer> collection = new HashSet<Integer>();
        collection.add(3);
        collection.add(1);
        collection.add(2);
        collection.add(null);
 
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.addAll(collection);
        System.out.println(treeSet);  

	}

}
//Exception in thread "main" java.lang.NullPointerException