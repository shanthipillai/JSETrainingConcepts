package jse.training.cocepts.enumkey.banksample;

public enum BankEnum  {
	HDFC(new HDFC()), ICICI(new ICICI());
	
	Bank banktype;
	
	
	BankEnum(jse.training.cocepts.enumkey.banksample.Bank bank) {
	banktype=bank;
		
	}

	public Bank getBankObject()
	{
		return banktype;
	}

	/*
	BankEnum(Bank bank) throws InstantiationException, IllegalAccessException
	{
	 banktype=bank.getClass().newInstance();
	}
	
*/
}
