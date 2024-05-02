package jse.training.cocepts.accessmodifiers.exceptions;

import java.util.Scanner;

public class Exception4 {

	public void method1() throws ClassNotFoundException
	{
		try {
			method2();
			System.out.println("Hello");
		} catch (ClassNotFoundException e) {
			System.out.println("Enter Valid Name");
			method2();
		}
	}

	public void method2() throws ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Class Name");
		String s=sc.next();
		Class obj=Class.forName(s);
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Exception4 obj=new Exception4();
		obj.method1();
	}
	
}
