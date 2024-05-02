package jse.training.cocepts.debug;

public class CheckPrimeOrNot {
public static void main(String[] args) {
	int no=11;
	int count=0;
	//
	for(int i=1;i<=no;i++)
	{
		//3%1, 3%3
		//20%2==0
		//20%3=
		//20%4=0
		//20%5=0
		//
		if(no%i==0)
		{
		
		
			count++;
		}
		

	
	}
	
	if(count<=2)
	{
		System.out.println(no);
	}
}
}
