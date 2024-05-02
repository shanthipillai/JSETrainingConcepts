package jse.training.objectconcepts;

public class Parent {
	
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	int x=50;
	private int y=10;
	static int z=20;
	
public	Parent()
	{
		
	}
public void print()
{
	System.out.println("Invoked instance method");
}

public static void staticPrint()
{
	System.out.println("Invoked Static  method");
}


public final static void staticFinalPrint()
{
	System.out.println("Invoked Static final method");
}

public final  void finalPrint()
{
	System.out.println("Invoked  final method");
}
}
