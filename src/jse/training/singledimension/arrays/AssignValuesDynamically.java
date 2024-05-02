package jse.training.singledimension.arrays;

import java.util.Scanner;

public class AssignValuesDynamically {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int rollNo[]=new int[5];
        //Dynamically Assigning Values using for loop
        for(int i=0;i<rollNo.length;i++)
        {
        	System.out.println("Enter"+i+"value");
            rollNo[i]	=sc.nextInt();
        }
        
        for(int rollnos:rollNo)
        {
        	System.out.println(rollnos);
        }
      /*  
        for(int i=0;i<rollNo.length;i++)
        {
        	System.out.println(rollNo[i]);
        }
        */
	}

}
