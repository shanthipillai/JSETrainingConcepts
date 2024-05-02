package jse.training.cocepts.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ArraysIteration8 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	
	Arrays.stream(a).forEach(System.out::println);
	Arrays.stream(a).filter(i->i%2==0).forEach(System.out::println);
	Arrays.stream(a).filter(i->i%2!=0).forEach(System.out::println);
	
	Employee emp1=new Employee(1,"Shanthi");
	Employee emp2=new Employee(2,"Shanthi1");
	Employee emp3=new Employee(3,"Shanthi2");
	Employee emp[]= {emp1, emp2, emp3};
	
	Comparator<Employee> ecmp=new Comparator<Employee>() {
	public int compare(Employee e1, Employee  e2) {
		if(e1.id>e2.id)
			return -1;
		else
		return 1;
	};
	};
	Arrays.stream(emp).sorted(ecmp).forEach(e->System.out.println(e.getId()+""+e.getName()));
   List<Integer> stream=Arrays.stream(a).boxed().collect(Collectors.toList());
  List<Integer> list =Arrays.asList(1,2,3,4,5);
  
  Arrays.fill(a, 5);

  Arrays.stream(a).forEach(System.out::println);
  

   


}
}
