package Output_Of_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class demo67 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		System.out.println(sum(list)); //5.0

	}

	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number num : list) {
			sum += num.doubleValue();
		}
		return sum;
	}

}
