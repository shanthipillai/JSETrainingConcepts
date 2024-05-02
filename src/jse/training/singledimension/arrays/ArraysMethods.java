package jse.training.singledimension.arrays;

import java.util.Scanner;

public class ArraysMethods {

	public void studNames(String names[])
	{
		for(String name:names)
		{
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
	String studNames[]=new String[5];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<studNames.length;i++)
	{
		System.out.println("Enter Value");
		studNames[i]=sc.next();
	}
//Ready with the Array
	
	ArraysMethods obj=new ArraysMethods();
	obj.studNames(studNames);
	}

}
