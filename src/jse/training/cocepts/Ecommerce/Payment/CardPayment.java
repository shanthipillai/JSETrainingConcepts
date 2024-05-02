package jse.training.cocepts.Ecommerce.Payment;

public class CardPayment implements Payment{

	@Override
	public String pay() {
		//System.out.println("Card Payment Selected");
		return "Card Payment Selected";
	}

}
