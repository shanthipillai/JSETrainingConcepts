package jse.training.multidiimension.arrays;

public class MDArraysDeclaration {

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
		
		//Manually assigning values to matrix dynamic array
		matrix[0][0]=10;
		matrix[0][1]=11;
		matrix[1][0]=12;
		matrix[1][1]=13;

	}

}
