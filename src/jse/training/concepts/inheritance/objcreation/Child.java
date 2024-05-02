package jse.training.concepts.inheritance.objcreation;

public class Child extends Parent {
	Child()
	{
		//this refers to current class object reference
		//super refers to immediate parent class object
		super();
	System.out.println("Child class construcotr invoked");
	System.out.println(this);
	
	}
	
	
	
}
