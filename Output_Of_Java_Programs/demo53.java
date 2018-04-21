package Output_Of_Java_Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class demo53 {

	public static void main(String[] args) {
		Set s = new LinkedHashSet();
        s.add("1");
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(s);
	}
}

/*[1, 1, 3, 2]
LinkedHashSet maintains insertion order and does not allow duplicates.*/