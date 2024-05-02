package jse.training.cocepts.exceptions.customexceptions.checked;

import java.util.Scanner;

public class Bank {
	
	public void withdraw() throws InsufficientFunds
	{
		double balance=10000;
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter amount");
			double amt= sc.nextDouble();
			if(amt>balance)
			{
				throw new InsufficientFunds();
			}
			else
			{
				balance=balance-amt;
				System.out.println(balance);
			}
	}

}
