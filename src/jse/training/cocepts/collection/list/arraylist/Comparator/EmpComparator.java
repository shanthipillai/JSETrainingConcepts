package jse.training.cocepts.collection.list.arraylist.Comparator;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter@AllArgsConstructor@NoArgsConstructor
public class EmpComparator implements Comparator<EmpComparator> {

	
	private int empId;
	private String empName;
	@Override
	public int compare(EmpComparator o1, EmpComparator o2) {
		if(o1.getEmpName().length()<o2.getEmpName().length())
		return 1;
		return -1;
	}
	


}
