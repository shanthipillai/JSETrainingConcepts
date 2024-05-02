package jse.training.cocepts.collection.map.treemap;

import java.util.Comparator;

public class UserSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		  if(o1.getEmpSal()<o2.getEmpSal())
       	   return 1;
			return -1;
	}

}
