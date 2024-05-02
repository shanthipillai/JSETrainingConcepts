package jse.training.concepts.superkeyword;

public class HDFC extends Bank {
	int pin;
	float amount;
	HDFC()
	{
		//super();
	}
	
	HDFC(int accountNumber, String customerName, int pin, float amount)
	{
		//Super Class Constructor Calling
		super(accountNumber, customerName);
		this.pin=pin;
		this.amount=amount;
		
	}
	
	public void printBankDetails()
	{
		System.out.println(accountNumber);
		System.out.println(customerName);
		System.out.println(pin);
		System.out.println(amount);
	}

}
