package jse.training.conidtionalstatements.loops.nested;

public class Patter2 {
public static void main(String[] args) {
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=i;j++)  //0<=0; 0<=1, 1<=1;
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
