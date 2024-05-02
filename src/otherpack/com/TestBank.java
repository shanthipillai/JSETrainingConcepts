package otherpack.com;

import jse.training.concepts.superkeyword.Bank;

public class TestBank {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		

		//Has a relation doesn't work
		//Can't access protected members from other packages
		/*irrespective of Bank class constructor protected /not no member is accessible 
		 * outside the package without inheriting the parent
		*/
	}
	

}
