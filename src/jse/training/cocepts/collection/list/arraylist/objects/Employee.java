package jse.training.cocepts.collection.list.arraylist.objects;

public class Employee {
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


}
