package jse.training.singledimension.arrays;

import java.util.Scanner;

public class ArrayMethod2 {

	
	public String[] sendStudentNames()
	{
		String studNames[]=new String[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<studNames.length;i++)
		{
			System.out.println("Enter Value");
			studNames[i]=sc.next();
		}
		
		return studNames;
	}
	public static void main(String[] args) {
		ArrayMethod2 obj=new ArrayMethod2();
	    String names[]=	obj.sendStudentNames();
	    for(String name:names)
	    {
	    	System.out.println(name);
	    }
	}

}
