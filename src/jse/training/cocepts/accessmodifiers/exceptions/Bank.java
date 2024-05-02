package jse.training.cocepts.accessmodifiers.exceptions;

import javax.naming.InsufficientResourcesException;

public class Bank {
double balance=10000;

public void withdraw(double amt) throws InsufficientFunds 
{
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
