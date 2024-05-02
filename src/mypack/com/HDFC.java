package mypack.com;

public class HDFC extends Bank {

	
	
	public static void main(String[] args) {
		//Accessing directly through HAS-A relation when existing in same package
	    //All protected members and non-protected are accessible when existing in same package.
		Bank bank = new Bank();
		bank.printStatement();
		System.out.println(bank.bankName);
		bank.withdraw();
		bank.deposit();
		
		//Accessing using Parent reference variable
		Bank hdfc = new HDFC();
		System.out.println(hdfc.bankName);
		hdfc.printStatement();
		hdfc.withdraw();
		hdfc.deposit();
		
		
		
	
	}
}
