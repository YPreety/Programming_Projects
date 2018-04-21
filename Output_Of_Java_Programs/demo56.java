package Output_Of_Java_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//[name=ankit, name=brad]
public class demo56 {

	public static void main(String[] args) {
		Employee5 emp1=new Employee5("ankit");
        Employee5 emp2=new Employee5("brad");
       
       ArrayList<Employee5> list=new ArrayList<Employee5>();
        list.add(emp1);
        list.add(emp2);
 
        Collections.sort(list,new Employee5.ComparatorName());
        System.out.println(list);

	}

}
class Employee5{
    String name; 
    public Employee5() {}
    public Employee5(String name) {
        this.name = name;
    }  
    public String toString() {
        return "name=" + name;
    }
    static class ComparatorName implements Comparator<Employee5>{
        public int compare(Employee5 obj1, Employee5 obj2) {
           return obj1.name.compareTo(obj2.name);
        }
    }
}