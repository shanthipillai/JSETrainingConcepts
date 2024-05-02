package jse.training.concepts.constructors;

public class Amazon {

	//Has A relationship
	public void order()
	{
		Payment payment=new Payment();
		payment.processPayment();
		System.out.println("Order has successfully been placed");
	}
	
	public static void main(String[] args) {
		Amazon amazon=new Amazon();
		amazon.order();
	}
	
	
}
