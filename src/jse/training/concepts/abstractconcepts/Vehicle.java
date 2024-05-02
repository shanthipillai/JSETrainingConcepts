package jse.training.concepts.abstractconcepts;

public abstract class Vehicle {
	int a,b;
	public Vehicle()
	{
		
	}
	
	abstract public void drive();
	  abstract  void calculateMileage();
	
	public void speedometer()
	{
		System.out.println("Speed calculation");
	}
	
}
