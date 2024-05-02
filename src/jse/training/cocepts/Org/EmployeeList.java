package jse.training.cocepts.Org;

public class EmployeeList {
Employee[] emp;

public EmployeeList() {
	super();
	// TODO Auto-generated constructor stub
}

public EmployeeList(Employee[] emp) {
	super();
	this.emp = emp;
}

public Employee[] getEmp() {
	
	
	return emp;
}


	public  void  display() {
	//String val=null;
	
	for(Employee emp:getEmp())
	{
		System.out.println(
	                         "Empid= "           + emp.getEmpId()+
			                  "\nEmpname= "     +emp.getEname()+
			                  "\nStreet="              +emp.getAddress().getStreetName()+
			                   "\nCity= "                +emp.getAddress().getCity()+
			                   "\nPincode= "          +emp.getAddress().getPinCode()
				);
		System.out.println("---------------------------------------------------------");
	}





}
}
