package Output_Of_Java_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo63 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		map.put(4, 1);
		map.put(2, 6);
		map.put(5, 1);
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		List<Entry<Integer, Integer>> listOfentrySet = new ArrayList<Entry<Integer, Integer>>(entrySet);
		Collections.sort(listOfentrySet, new Sort3());
		for (Map.Entry<Integer, Integer> entry : listOfentrySet)
			System.out.print(entry.getKey()); //542
	}
}

class Sort3 implements Comparator<Map.Entry<Integer, Integer>> {
	@Override
	public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
		return (entry2.getKey()).compareTo(entry1.getKey());
	}
}