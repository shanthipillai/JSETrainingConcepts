package jse.training.polymorphism;

public class AdvancePrinter extends ClassicPrinter {

	@Override
	public void features()
	{
		
	}
	//@Override
	public static void print()
	{
		System.out.println("Advance Printing");
	}
	
	
	public static void main(String[] args) {
		ClassicPrinter obj=new AdvancePrinter();
		obj.print();
		
		//AdvancePrinter.print();
	}
}
