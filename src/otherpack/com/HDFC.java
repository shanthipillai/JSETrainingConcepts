package otherpack.com;

import mypack.com.Bank;

public class HDFC extends Bank {
public static void main(String[] args) {
	//Child Class Extending Parent - IS - A relation
	//You can access protected members from other package by creating object to the child class itself.
	HDFC hdfc=new HDFC();
	System.out.println(hdfc.bankName);
	hdfc.printStatement();
	hdfc.withdraw();
	hdfc.deposit();
	
	/*If you placed the child class object in parent class reference the protected
	members are not accessible only public members will be accessible*/
	Bank b=new HDFC();
    b.printStatement();
	
	Bank bank=new Bank();
	b.printStatement();
}
}
