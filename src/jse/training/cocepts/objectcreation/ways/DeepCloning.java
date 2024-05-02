package jse.training.cocepts.objectcreation.ways;

public class DeepCloning {
public static void main(String[] args) throws CloneNotSupportedException {
	EmployeeClone emp1=new EmployeeClone();
	

	EmployeeClone emp2=	(EmployeeClone) emp1.clone();
	
	System.out.println(emp1.empID);
	System.out.println(emp1.empSal);
	
	
	System.out.println(emp2.empID);
	System.out.println(emp2.empSal);
	
	
	emp1.empID=10;
	
	System.out.println(emp1.empID);
	System.out.println(emp1.empSal);
	
	
	System.out.println(emp2.empID);
	System.out.println(emp2.empSal);
	
}
}
