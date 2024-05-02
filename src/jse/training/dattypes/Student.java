package jse.training.dattypes;

public class Student {
//Declared Variables with their respective datatypes
	//Non-static Variables
	//Instance Variables
 String studentName;
String collegeName;
String studentAddress;
char specialChar;


byte marks;
short registrationNo;
int studentRollNo;
long hallTicketNo;

float buildingFee;
double annualFee;

boolean regularStudent;

public static void main(String[] args) {
	Student obj=new Student();
	Student student1=new Student();
	Student student2=new Student();
	System.out.println(obj.studentName);
	System.out.println(obj.collegeName);
	System.out.println(obj.studentAddress);
	System.out.println(obj.specialChar);
	System.out.println(obj.marks);
	System.out.println(obj.registrationNo);
	System.out.println(obj.hallTicketNo);
	System.out.println(obj.buildingFee);
	System.out.println(obj.annualFee);
	System.out.println(obj.regularStudent);
	
	student1.studentName="Sharavani";
	System.out.println(student1.studentName);
	
	obj.studentName="Shanthi";
	System.out.println(student2.studentName);
	/*
	System.out.println(obj);
	System.out.println(obj1);
	*/
}

}
