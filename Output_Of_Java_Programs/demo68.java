package Output_Of_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class demo68 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		m(list);
	}

	public static void m(List<Number> list) {
		System.out.println(list);
	}
}


//Compile time error
//List<Number> cannot accept List<Integer>, to avoid compilation error we must use List<? extends Number>