package jse.training.cocepts.debug;

public class PrimeOrNot2 {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=10;j++)
		{
			if(i%j==0)
			{
				count++;
			}
			
			if(count<2 )
			{
				System.out.println(j);
			}
			
			count=0;
			
		}
	}
}
}
