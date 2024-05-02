package jse.training.cocepts.exceptions.trycatch;

import java.util.Scanner;

public class TryCatchHandling {
	static Scanner sc=new Scanner(System.in);
	static int numerator;
	static int denominator;
static
	{
		System.out.println("Enter numerator");
		numerator=sc.nextInt();
		System.out.println("Enter denominator");
		denominator=sc.nextInt();
	}
	public static void case1()
	{
		try
		{
		int c=numerator/denominator;
		}
		catch(Exception e)
		{
			  System.out.println("Printing the exception");
			  System.out.println(e);
			
		}
		
		System.out.println("Rest of the code executing after the block handled");
	}
	
	public static void case2()
	{
		try
		{
			int c=numerator/denominator;
		System.out.println("Will this code executes with this or it comes out of the block");
		}
		catch(Exception e)
		{
			  System.out.println("Printing the exception");
			  System.out.println(e);
			
		}
		System.out.println("Rest of the code executing after the block handled");
		
	}
	
	public static void case3()
	{
		
		try
		{
			int c=numerator/denominator;
		System.out.println("Will this code executes with this or it comes out of the block");
		}
		catch(Exception e)
		{
			System.out.println("Sorry you've entered Invalid denominator");
			System.out.println("Enter numerator Again");
			numerator=sc.nextInt();
			System.out.println("Enter denominator Again");
			denominator=sc.nextInt();
			case3();
			
		}
		System.out.println("Rest of the code executing after the block handled");
		
	}
	
	public static void case0()
	{
		int c=10/0;
		System.out.println("No handling will this statement prints");
	}
public static void main(String[] args) {
	
	//case0();
	//case1();
	//case2();
	case3();
	
}
	
	
}
