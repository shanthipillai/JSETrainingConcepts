package jse.training.cocepts.accessmodifiers.exceptions;

import java.util.Scanner;

public class Transaction {
public static void main(String[] args) throws InsufficientFunds {
	Bank bank=new Bank();
	try
	{
	bank.withdraw(12000);
	}
	catch(Exception e)
	{
		System.out.println("Closed the transaction");
		
	}
}
}
