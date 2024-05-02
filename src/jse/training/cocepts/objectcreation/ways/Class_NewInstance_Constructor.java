package jse.training.cocepts.objectcreation.ways;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Class_NewInstance_Constructor {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		
		
		Constructor<Employee> emp = Employee.class.getConstructor();
		Employee empobj = emp.newInstance();
		System.out.println(empobj.getEmpID());
		System.out.println(empobj.getEmpSal());

		Constructor<Employee> emp1 = Employee.class.getConstructor(long.class, double.class);
		Employee empobj1 = emp1.newInstance(11, 2000);

		System.out.println(empobj1.getEmpID());
		System.out.println(empobj1.getEmpSal());
	}
}
