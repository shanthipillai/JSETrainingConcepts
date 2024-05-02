package jse.training.cocepts.collection.list.arraylist.objects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeALFileRead {
public static void main(String[] args) throws IOException {
	//ArrayList to accept employee objects
	ArrayList<Employee> employees=new ArrayList<Employee>();
	/*
	employees.add(new Employee(1,"Shanthi"));
	Employee emp1=new Employee(2,"Shyra");
	employees.add(emp1);
	employees.add(new Employee(3,"Sharvani"));
	employees.add(new Employee(4,"Saleha"));
	*/
	File file=new File("D:\\employees.txt");
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	String readLines;
	while((readLines=br.readLine())!=null)
	{
	String values[]=	readLines.split(",");
	Integer empid=Integer.valueOf(values[0]);
	String empname=values[1];
	
	Employee emp=new Employee(empid, empname);
	
	employees.add(emp);
	
	
	}
	
	//Print details of ArrayList
Iterator<Employee>itr	=employees.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	
}
}
