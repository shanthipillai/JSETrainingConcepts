package jse.training.cocepts.Ecommerce.Payment;

public class WalletPayment implements Payment {

	@Override
	public String pay() {
	//System.out.println("Wallet Payment Enabled");
		return "Wallet Payment Selected";
	}

}
