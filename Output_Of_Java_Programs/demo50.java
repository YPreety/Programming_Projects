package Output_Of_Java_Programs;

import java.util.Map;
import java.util.TreeMap;

public class demo50 {

	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<Integer, String>();
        m.put(11, "audi");
        m.put(null, null);
        m.put(11, "bmw");
        m.put(null, "fer");

        System.out.println(m.size());
        System.out.println(m);
	}
}
/*Exception in thread "main" java.lang.NullPointerException
at java.util.TreeMap.put(Unknown Source)
at Output_Of_Java_Programs.demo50.main(demo50.java:11)*/