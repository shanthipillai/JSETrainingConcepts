package jse.training.cocepts.collection.list.arraylist.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting1 {
	//Comparator interface can be implemented as Class or Anonymous and pass it to Collections class along with your list

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(23);
	al.add(243);
	al.add(53);
	al.add(237);
	al.add(64);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	//Way 1
	Collections.sort(al, Comparator.reverseOrder());
	System.out.println(al);
	
	
	
	

	Comparator<String> compares=new Comparator<String>() {
//test1, testing2, testingcompleted
		@Override
		public int compare(String o1, String o2) {
			if(o1.length()<o2.length())
				return -1;
			return 1;
		}
	};

	
	Comparator<Employee> comparee=new Comparator<Employee>() {
		//test1, testing2, testingcompleted
				@Override
				public int compare(Employee o1, Employee o2) {
					if(o1.getEmpId()<o2.getEmpId())
						return 1;
					return -1;
				}
			};
	
	ArrayList<String> strings=new ArrayList<String>();
	strings.add("test1");
	strings.add("testing2");
	strings.add("testingcompleted");
	//Way2
	Collections.sort(strings,compares);
	System.out.println(strings);
	
	
	
	ArrayList<Employee> employees=new ArrayList<Employee>();
	employees.add(new Employee(11,"Shanthi"));
	Employee emp1=new Employee(24,"Shyra");
	employees.add(emp1);
	employees.add(new Employee(35,"Sharvani"));
	employees.add(new Employee(4,"Saleha"));
	
	//Collections.sort(employees, comparee);
	//Way3
	Collections.sort(employees, new EmployeesSorting());

	System.out.println(employees);
}
}
