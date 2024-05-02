package jse.training.statickey;

public class StaticBlock {
	//Understand the flow
	static int x;
	static int z;
	
	int y=30;
	StaticBlock() {
		x=20;
		System.out.println("Static block default constructor is invoked");
	}

	// Creation of static block -1
	static {
		x=30;
	//	y=50;
		System.out.println("Static Block");
	}
	
	static 
	{
		System.out.println("Static Block2");
	}

	// Static Method
	public static void staticMethod() {
		System.out.println("This is static Method");
	}
	// Instance Method

	public void instanceMethod() {
		System.out.println("Instance Method");
	}
	
	//Main method
	
	public static void main(String[] args) {
		System.out.println("First line of main method");
		StaticBlock obj=new StaticBlock();
		obj.instanceMethod();
		StaticBlock.staticMethod();
		
	}

}
