package jse.training.cocepts.debug;

import java.util.Stack;

public class PrimeNumbers {
	public void primeNumMethod()
	{
	int number;
		
	
	for(int i=2;i<=10;i++)
	{
		System.out.println("i"+i);
		
		number=0;
		
		for(int j=2;j<i;j++)
		{
			System.out.println("j="+j);
		
			if(i%j==0)
			{
				number++;
				
			}
		}
		if(number==0)
		{
			
			System.out.println(i);
		}
	}
	}
	
	public static void main(String args[])
	{
		PrimeNumbers pn=new PrimeNumbers();
		pn.primeNumMethod();
		
	
	
	}
	}