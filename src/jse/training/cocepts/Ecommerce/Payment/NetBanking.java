package jse.training.cocepts.Ecommerce.Payment;

public class NetBanking implements Payment {


	@Override
	public String pay() {
	System.out.println("Net Baking Payment Enabled");
		return "Net Banking Selected";
	}
}
