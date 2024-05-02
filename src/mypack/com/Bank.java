package mypack.com;

public class Bank {

	protected String bankName;
	public Bank()
	{
		System.out.println("Bank constructor initiated");
	}
	
	public void printStatement()
	{
		System.out.println("Statement is downloading");
	}
	
	protected void withdraw()
	{
		System.out.println("Amount withdraw will be processed");
	}
	
	protected void deposit()
	{
		System.out.println("Amount deposit will be processed");
	}
}
