package jse.training.concepts.staticoverride;

public class Child extends Parent{
	

//@Override
	public static void parent()
	{
		System.out.println("Parent Static Method");
	}
	
	@Override
	public void print()
	{
		System.out.println("This parent print method");
	}

}
