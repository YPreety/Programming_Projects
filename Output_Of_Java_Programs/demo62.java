package Output_Of_Java_Programs;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class demo62 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 1);
		map.put(4, 8);
		Set<Entry<Integer, Integer>> set = map.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list, new Sort1());
		for (Map.Entry<Integer, Integer> entry : list)
			System.out.print(entry.getKey()); //412
	}
}

class Sort1 implements Comparator<Map.Entry<Integer, Integer>> {
	@Override
	public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
		return (entry2.getValue()).compareTo(entry1.getValue());
	}
}