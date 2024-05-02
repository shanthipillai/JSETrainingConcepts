package jse.training.thiskeyword;

public class Scenario2 {
	Scenario2()
	{
		System.out.println("This is default constructor");
	}
	
	Scenario2(int x)
	{
		System.out.println("This is single parameterized constructor");
	}
	
	Scenario2(int x,int y)
	{
		//Follow the chain pattern this(1)-->this()
		this();
	//	this(1);
		System.out.println("This is two  parameterized constructor");
	}
}
