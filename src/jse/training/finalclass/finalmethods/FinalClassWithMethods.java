package jse.training.finalclass.finalmethods;

public final class FinalClassWithMethods {

	
	public void alloweOveride()
	{
		System.out.println("You can overide this method");
		
	}
	
	final void noOverrideing()
	{
		System.out.println("This is method can't be overriden");
	}
	
	static void useStaticMethodOfThisClass()
	{
		System.out.println("This is a static method");
	}
}
