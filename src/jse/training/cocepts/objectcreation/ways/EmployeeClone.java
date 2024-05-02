package jse.training.cocepts.objectcreation.ways;

public class EmployeeClone implements Cloneable {
long empID;
double empSal;

public EmployeeClone() {
	super();
	// TODO Auto-generated constructor stub
}
public EmployeeClone(long empID, double empSal) {
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

@Override
protected Object clone() throws CloneNotSupportedException {
	return super.clone();
}
}
