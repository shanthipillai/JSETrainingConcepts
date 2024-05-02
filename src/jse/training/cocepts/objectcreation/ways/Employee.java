package jse.training.cocepts.objectcreation.ways;

public class Employee {
long empID;
double empSal;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(long empID, double empSal) {
	super();
	this.empID = empID;
	this.empSal = empSal;
}
public long getEmpID() {
	return empID;
}
public void setEmpID(long empID) {
	this.empID = empID;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}


}
