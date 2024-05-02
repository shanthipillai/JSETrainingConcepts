package jse.training.thiskeyword;

public class Scenario3 {

	//Non-Static Method
	public void print()
	{
		System.out.println("Print initiated");
	}
	
	//Static Method
	public static void giveInstructions()
	{
		//Not acceptable 
		//this.print();   
		//print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
