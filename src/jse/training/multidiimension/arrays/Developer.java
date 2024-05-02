package jse.training.multidiimension.arrays;

public class Developer {
	public void printMDArrayForEach(int matrix[][])
	{
		//For - Each Loop
		for(int row[]:matrix)
		{
			for(int rw:row)
			{
				System.out.print(rw+"  ");
			}
			System.out.println();
		}
	}
	
	public void printMDArrayForLoop(int matrix[][],int rows, int cols)
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(matrix[i][j]+"  ");
			}
			
			System.out.println();
		}
		
	}
}
