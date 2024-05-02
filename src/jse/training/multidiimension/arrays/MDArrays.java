package jse.training.multidiimension.arrays;

public class MDArrays {
public static void main(String[] args) {
	int arry1[][]=new int[3][2];
	System.out.println(arry1.length);
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(arry1[i][j]+"  ");
		}
		
		System.out.println();
	}
	
	for (int[] rowArray : arry1) { 
		System.out.println(rowArray.length);
        for (int num : rowArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
}
}
