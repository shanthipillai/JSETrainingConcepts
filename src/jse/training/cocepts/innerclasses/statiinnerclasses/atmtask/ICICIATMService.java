package jse.training.cocepts.innerclasses.statiinnerclasses.atmtask;



public class ICICIATMService implements Bank {
 double accountBalance=90000;
 String status="";
	@Override
	public String withdraw(double amt) {
		if(accountBalance>0 && amt>0 && amt<=accountBalance)
		{
			accountBalance=accountBalance-amt;
			status="Amount has been successfully withrawn";
		}
		else
		{
			status="Transaction Failed";
			throw new InSufficientFundsAcct();
		
		}
		
		return status;
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}

}
