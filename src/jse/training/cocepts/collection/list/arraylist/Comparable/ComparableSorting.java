package jse.training.cocepts.collection.list.arraylist.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparableSorting {

public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(new Employee(1,"Shyra"));
	al.add(new Employee(22,"Shanthi"));
	al.add(new Employee(67,"Sharvani"));
	al.add(new Employee(44,"Saleha"));
	
	Comparator<Employee> empcomp=new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getEmpId()<o2.getEmpId())
				return -1;
			return 1;
		}
	};
	Collections.sort(al);
	//Collections.sort(al, empcomp);
	
    Iterator<Employee>iter=al.iterator();
    while(iter.hasNext())
    {
    	System.out.println(iter.next());
    }
}
}
