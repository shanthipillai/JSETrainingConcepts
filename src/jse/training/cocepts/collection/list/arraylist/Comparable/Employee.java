package jse.training.cocepts.collection.list.arraylist.Comparable;

public class Employee implements Comparable<Employee> {
private int empId;
private String empName;


public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}

public int getEmpId() {
	return empId;
}

public String getEmpName() {
	return empName;
}



@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Emp Id="+empId+
				    " EName="+empName;
	}

@Override
public int compareTo(Employee that) {
	// TODO Auto-generated method stub
	//emp1.compareTo(emp2);
	
	if(this.empId<that.empId)
	return 1;
	return -1;
}


}
