package jse.training.multidiimension.arrays;

import java.util.Scanner;

public class ClientRTester {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int matrix[][]=new int[2][2];
       for(int rows=0;rows<2;rows++)
       {
    	   for(int cols=0;cols<2;cols++)
    	   {
    		   System.out.println("Enter an["+rows+" "+cols+"] element");
				matrix[rows][cols]=sc.nextInt();
    		   
    	   }
       }
       
       Developer developer=new Developer();
       developer.printMDArrayForEach(matrix);
       developer.printMDArrayForLoop(matrix, 2, 2);
	}

}
