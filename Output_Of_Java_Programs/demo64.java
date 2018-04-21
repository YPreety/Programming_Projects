package Output_Of_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class demo64 {

	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<Number>();
		numberList.add(2);
		numberList.add(3);
		m(numberList);

	}

	static void m(List<? super Double> l) {
		System.out.print(l.get(0)); //2
		System.out.print(l.get(1));//3
	}

}
