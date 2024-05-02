package jse.training.cocepts.collection.list.arraylist.objects;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeAL {
public static void main(String[] args) {
	//ArrayList to accept employee objects
	ArrayList<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(1,"Shanthi"));
	Employee emp1=new Employee(2,"Shyra");
	employees.add(emp1);
	employees.add(new Employee(3,"Sharvani"));
	employees.add(new Employee(4,"Saleha"));
	
	Iterator<Employee>itr=employees.iterator();
	while(itr.hasNext())
	{
	//	Employee emp=itr.next();
				
		System.out.println(itr.next());
	//	System.out.println("Emp Id= "+emp.getEmpId()+" Emp Name="+emp.getEmpName());
	}
}
}
