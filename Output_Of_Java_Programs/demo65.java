package Output_Of_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class demo65 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		m(l);

	}

	static void m(List<? super Double> l) {
		System.out.println(l.get(0));
		System.out.println(l.get(1));
	}
}

//Compiler error
/*List<? super Double> can not accept List<Integer>, it can accept list of anySuperClassOfDouble 
i.e. List<Number> or List<Object>*/