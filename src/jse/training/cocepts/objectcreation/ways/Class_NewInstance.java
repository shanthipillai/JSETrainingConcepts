package jse.training.cocepts.objectcreation.ways;

public class Class_NewInstance {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

//Way1 
Employee emp	=Employee.class.newInstance();
System.out.println(emp.getEmpID());
System.out.println(emp.getEmpSal());

//Way2
Employee emp1=(Employee) Class.forName("jse.training.cocepts.objectcreation.ways.Employee").newInstance();
System.out.println(emp1.getEmpID());
System.out.println(emp1.getEmpSal());
}
}
