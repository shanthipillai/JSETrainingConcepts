package jse.training.cocepts.Org;

public class Organization {

	public static void main(String[] args) {
		Address addr=new Address("Manikonda", 530016, "Hyderabad");
		
		Employee emp1=new Employee(123, "employee1", addr);
		Employee emp2=new Employee(123, "employee2", addr);
		Employee emp3=new Employee(123, "employee3", addr);
		
		Employee emp[]= {emp1, emp2, emp3};
		
		EmployeeList list=new EmployeeList(emp);
        list.display();
	}

}
