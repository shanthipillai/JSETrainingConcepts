package jse.training.cocepts.accessmodifiers.test;

public class Parent {
	
	private Parent()
	{
		System.out.println("This is default constructor");
	}
	
	public Parent(int x)
	{
		System.out.println("This is para constructor");
	}
	
	public void method1()
	{
		
		new Parent();
		System.out.println("Method1");
	}

}
