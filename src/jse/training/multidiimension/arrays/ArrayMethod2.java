package jse.training.multidiimension.arrays;

import java.util.Scanner;

public class ArrayMethod2 {

	
	public int[][] getSqureMatrix()
	{
		Scanner sc=new Scanner(System.in);
		int squareMatrix[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter the value");
				squareMatrix[i][j]=sc.nextInt();
			}
		}
		
		return squareMatrix;
	}
	public static void main(String[] args) {
	 ArrayMethod2 obj=new ArrayMethod2();
	  int returnedArray[][]= obj.getSqureMatrix();
	  for(int arr[]: returnedArray)
	  {
		  for(int printval:arr)
		  {
			  System.out.print(printval+"  ");
		  }
		  
		  System.out.println();
	  }

}
}