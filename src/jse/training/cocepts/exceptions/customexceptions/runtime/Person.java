package jse.training.cocepts.exceptions.customexceptions.runtime;

import java.util.Scanner;

public class Person {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age:");
	int age=sc.nextInt();
	
	if(age<18)
	{
	throw	new AgeInvalidException();
	}
	else
	{
		System.out.println("You are valid for voting");
	}
	
}
}
