package jse.training.cocepts.accessmodifiers.exceptions;

public class CheckedExceptions {
public static void main(String[] args)  {
	try
	{
	Class obj=Class.forName("java.lang.Object1");
	
	}
	catch(Exception e)
	{
		System.out.println("Please give the right class name");
	}	
	
	try
	{
		int a=20/0;
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Please enter valide input");
	}
	
	catch(RuntimeException re)
	{
		System.out.println(re);
	}
	

	int x=10;
	System.out.println(x);
	
}
}
