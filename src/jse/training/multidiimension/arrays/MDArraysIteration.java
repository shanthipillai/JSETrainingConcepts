package jse.training.multidiimension.arrays;

public class MDArraysIteration {

	public static void main(String[] args) {
		//Dynamic Array
		int matrix[][]=new int[2][2];
		
		//Static Array
		int matrixstatic[][]= {{1,2,3},{4,5,6},{7,8,9}};
		/*
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		
		//Printing the Array traditional for loop
		for(int rows=0;rows<3;rows++)
		{
			for(int cols=0;cols<3;cols++)
			{
				System.out.print(matrixstatic[rows][cols]+"  ");
			}
			System.out.println();
		}
	
		//For Each Loop - Iteration
		for(int rows[]:matrixstatic)
		{
			for(int rowval:rows)
			{
				System.out.print(rowval+"    ");
			}
			System.out.println();
		}
		//Manually assigning values to matrix dynamic array
		matrix[0][0]=10;
		matrix[0][1]=11;
		matrix[1][0]=12;
		matrix[1][1]=13;
   //Assignment
	}

}
