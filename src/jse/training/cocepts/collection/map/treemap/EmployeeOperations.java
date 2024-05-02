package jse.training.cocepts.collection.map.treemap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class EmployeeOperations {
public static void main(String[] args) {
	//Creating Object of Employee type using parameterized constructor
	Employee emp1=new Employee(123, 70000);
	Employee emp2=new Employee(124, 50000);
	Employee emp3=new Employee(125, 20000);
	Employee emp4=new Employee(100, 90000);
	Employee emp5=new Employee(35, 35000);
	
	
	//Creating TreeMap to store these object

Comparator<Integer> compare2=new Comparator<Integer>() {

	@Override
	public int compare(Integer o1, Integer o2) {
	if(o1<o2)
		return 1;
	    return -1;
	}
	
};



Comparator<Integer> compare3=new Comparator<Integer>() {

	@Override
	public int compare(Integer o1, Integer o2) {
	if(o1<o2)
		return -1;
	    return 1;
	}
	
};

	TreeMap<Employee, Integer> tmp=new TreeMap<>(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
		  Double d1=  o1.getEmpSal();
		  Double d2=o2.getEmpSal();
		  if(d1<d2)
			  return 1;
			return -1;
		}
	});
	tmp.put(emp1,1);
	tmp.put(emp2,2);
	tmp.put(emp3,3);
	tmp.put(emp4,4);
	tmp.put(emp5,5);
	
	for(Map.Entry<Employee, Integer> e: tmp.entrySet())
	{
		System.out.println("EMP ID=" +e .getKey().getEmpId() +  "Emp Sal"+e.getKey().getEmpSal()+"Key="+e.getValue());
				                         
	}
	
/*
Comparator<Employee> empsal=new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
	if(o1.getEmpSal()<o2.getEmpSal())
		return 1;
	return -1;
	}
};

//TreeMap<Integer, Employee> tmp=new TreeMap<Integer, Employee>(compare2.thenComparing(compare3));
TreeMap<Integer, Employee> tmp=new TreeMap<Integer, Employee>(compare2);
	System.out.println(tmp);
	
	
	tmp.put(1,emp1);
	tmp.put(3,emp2);
	tmp.put(2,emp3);
	tmp.put(8,emp4);
	tmp.put(7,emp5);

	
   System.out.println("First Comparator");
	for(Map.Entry<Integer, Employee> emp:tmp.entrySet())
	{
		System.out.println("Yout Key="+emp.getKey()+"EmpId= "+emp.getValue().getEmpId()+"Emp name="+emp.getValue().getEmpSal());
	}
	
*/
	
}
}
