package jse.training.cocepts.collection.list.arraylist.Comparator;

import java.util.Comparator;

public class EmployeesSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId()<o2.getEmpId())
			return 1;
		return -1;
	}

	

}
