package jse.training.cocepts.exceptions.trycatch;

import java.util.Scanner;
/*Try understanding the way Runtime exceptions are handled here
 * What happens if you don't handle the exception
 * 
 */
public class trycatchHandle {
public static void testExceptions()
{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter numerator:");
	 int a= sc.nextInt();
	System.out.println("Enter denominator:");
	int b=sc.nextInt();
	
	int c;
	try
	{
	c=a/b;
	try
	{
	String s=null;
	System.out.println(s.length());
	}
	
	catch(NullPointerException ne)
	{
		System.out.println(ne);
	}
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("You've entered an invalid denominator");
	testExceptions();
	}
	
}

public static void main(String[] args) {
	trycatchHandle.testExceptions();
}
}
