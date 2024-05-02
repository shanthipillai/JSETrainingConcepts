package jse.training.cocepts.collection.list.arraylist.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmpComparatorObjs2 {
//EmpComparatorObjs2 is dependent on EmComparator
	public static void main(String[] args) {
	ArrayList<EmpComparator> al=new ArrayList<EmpComparator>();
	al.add(new EmpComparator(1, "test11"));
	al.add(new EmpComparator(2, "test3"));
	al.add(new EmpComparator(3, "test3jjjjj"));
  Collections.sort(al, new EmpComparator());
	for(EmpComparator emp:al)
	{
		System.out.println(emp.getEmpId()+" "+emp.getEmpName());
	}
	}

}
