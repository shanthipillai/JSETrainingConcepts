package jse.training.cocepts.POJOs;

public class Employee {

	private String empName;
	private int empId;
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	


	public Employee(String empName, int empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.address = address;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	
	
	
	
}
