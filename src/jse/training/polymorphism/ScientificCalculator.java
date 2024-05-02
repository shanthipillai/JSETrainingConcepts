package jse.training.polymorphism;

public class ScientificCalculator extends Calculator {


	void generalCalculator()
	{
		System.out.println("Scientific Calculator");
	}
	
	
/*	Not allowed
	int generalCalculator()
	{
		System.out.println("This general purpose calculator");
	}
	*/
	
	
	public void newFeatures()
	{
		System.out.println("New Features of child class");
	}
}
