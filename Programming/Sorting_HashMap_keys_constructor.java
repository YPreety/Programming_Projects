package Programming;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sorting_HashMap_keys_constructor {

	static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		map.put("Jayant", 80);
		map.put("Abhishek", 90);
		map.put("Anushka", 80);
		map.put("Amit", 75);
		map.put("Danish", 40);

		sortbykey();

	}

	public static void sortbykey() {
		// TreeMap to store values of HashMap
		TreeMap<String, Integer> sorted = new TreeMap<>(map);

		// Display the TreeMap which is naturally sorted
		for (Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

}
