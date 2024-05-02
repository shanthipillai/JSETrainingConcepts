package jse.training.cocepts.accessmodifiers.exceptions;

import java.util.Scanner;

public class ExceptionTest {
	public static void division()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first val:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second val:");
		int b=sc.nextInt();
		try
		{
		int c=a/b;
		}
		catch(Exception e)
		{
			System.out.println("Hey have given invallid inputs");
			System.out.println("Please try again");
			division();
		}
	}
	public static void main(String[] args) {
	//	ExceptionTest.division(13, 0);
		division();
		System.out.println("hello are you going to Print?");
		
	}

}
