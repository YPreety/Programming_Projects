package Output_Of_Java_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class demo54 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("sam", "4");
		Employee emp2 = new Employee("amy", "2");

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		Collections.sort(list);
		System.out.println(list);

	}

}

class Employee implements Comparable<Employee> {
	String name;
	String id;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Employee otherEmployee) {
		return this.name.compareTo(otherEmployee.name);
	}

	@Override
	public String toString() {
		return "{" + "name=" + name + ", id=" + id + '}';  //[{name=amy, id=2}, {name=sam, id=4}]
	}
}