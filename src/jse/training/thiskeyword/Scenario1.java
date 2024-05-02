package jse.training.thiskeyword;

public class Scenario1 {
	
	public void print()
	{
		System.out.println("Print the line");
	}
	
	public void cancelPrint()
	{
		System.out.println("Cancelling the Print");
	}
	
	public void givePrint()
	{
		this.print();
		this.cancelPrint();
	}
public static void main(String[] args) {
	Scenario1 obj=new Scenario1();
	obj.givePrint();
}
}
