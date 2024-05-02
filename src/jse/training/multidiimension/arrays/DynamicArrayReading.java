package jse.training.multidiimension.arrays;

import java.util.Scanner;

public class DynamicArrayReading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//3*3=9
        int matrix[][]=new int[3][3];
        
        //Taking values from console and storing in an array
        for(int rows=0;rows<3;rows++)
		{
			for(int cols=0;cols<3;cols++)
			{
				System.out.println("Enter an["+rows+" "+cols+"] element");
				matrix[rows][cols]=sc.nextInt();
				
			}
		}
        
        //Print values from an array to console
        for(int rows=0;rows<3;rows++)
		{
			for(int cols=0;cols<3;cols++)
			{
				System.out.print(matrix[rows][cols]+"  ");
				
			}
			System.out.println();
		}
        
			}
      
	}


