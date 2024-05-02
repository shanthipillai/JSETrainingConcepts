package jse.training.cocepts.objectcreation.ways;

public class ShallowCloning {
public static void main(String[] args) {
	Employee emp1=new Employee();
    Employee emp2=emp1;
    
    System.out.println(emp1.empID);
    System.out.println(emp1.empSal);
    
    
    System.out.println(emp2.empID);
    System.out.println(emp2.empSal);
    
    
    emp1.empID=1234;
    emp1.empSal=50000;
    
    
    System.out.println(emp1.empID);
    System.out.println(emp1.empSal);
    
    
    System.out.println(emp2.empID);
    System.out.println(emp2.empSal);
}
}
