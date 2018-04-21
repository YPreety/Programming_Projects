package Output_Of_Java_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo55 {

	public static void main(String[] args) {
		Employee4 emp1=new Employee4("sam","4");
        Employee4 emp2=new Employee4("amy","2");
       ArrayList<Employee4> list=new ArrayList<Employee4>();
        list.add(emp1);
        list.add(emp2);
        Collections.sort(list,new Employee4());
        System.out.println(list); 
	}
}
class Employee4 implements Comparator<Employee4>{
    String name;
    String id;
   
    public Employee4() {}
   
    public Employee4(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
    @Override
    public int compare(Employee4 obj1, Employee4 obj2) {
           return obj2.name.compareTo(obj1.name);
    }
 
    @Override
    public String toString() {
        return "{" + "name=" + name + ", id=" + id  + '}'; //[{name=sam, id=4}, {name=amy, id=2}]
    } 
}