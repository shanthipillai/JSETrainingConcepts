package jse.training.cocepts.Org;

public class Employee {
private int empId;
private String ename;
private Address address;


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


public Employee(int empId, String ename, Address address) {
	super();
	this.empId = empId;
	this.ename = ename;
	this.address = address;
}


public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}

}
