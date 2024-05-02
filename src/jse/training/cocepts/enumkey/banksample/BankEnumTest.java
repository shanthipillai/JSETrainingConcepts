package jse.training.cocepts.enumkey.banksample;

public class BankEnumTest {
public static void main(String[] args) {

	BankEnum bank=BankEnum.HDFC;
//Passing enum object into the switch
	switch(bank)
	{
	case HDFC: bank.getBankObject().withdraw();
	break;
	case ICICI:bank.getBankObject().withdraw();
	break;
	}

}



}
