package jse.training.cocepts.innerclasses.anonymous;

public class MyFashions {
	static  double discount=0;
	
	static double finalPrice=0;
	static double discountApplied=0;
	
	public MyFashions()
	{
		System.out.println("Welcome to MyFashions");
	}
public class Clothing
{
	double priceOfSelectedItem=3000;
	public void payment()
	{
		System.out.println("Welcome to Clothing");
		enableDiscountPeriod(false, priceOfSelectedItem,"Clothing");
	
	}
	
}

class Apparels
{
	double priceOfSelectedItem=2000;
	public void payment()
	{
		System.out.println("Welcome to Apparel");
	enableDiscountPeriod(true, priceOfSelectedItem,"Apparel");
	
	}
}

class Jewellery
{
	double priceOfSelectedItem=1000;
	public void payment()
	{
		System.out.println("Welcome to Jewellery");
		enableDiscountPeriod(true, priceOfSelectedItem,"Jewellery");
		
	}
}

public  void enableDiscountPeriod(boolean enable,double price,String type)
{
	System.out.println(type);
	
	//System.out.println(enable+""+price);
	if(enable)
	{
		
        

	finalPrice= discounts.discount(price);

	}
	
	else
	{
	
		//System.out.println(discount);
		finalPrice=price-discount;
		//System.out.println(finalPrice);
	}
	System.out.println("Final Price of the product"+finalPrice);

}
	 BigBillionDiscounts discounts=new BigBillionDiscounts(){

	@Override
	public double discount(double price) {
	 
		if(price>=1000 && price<2000)
		{
			discount=(price*5)/100;
		}
		
		if(price==2000 && price<3000)
		{
			discount=(price*10)/100;
		}
		

		if(price==3000 && price<=5000)
		{
			discount=(price*10)/100;
			//System.out.println(discount);
		}
		return price-discount;
	}
	
};





}