package object.practic;

public class TryMethod {
	int x;
	static int y;
	public TryMethod()
	{
		x=10;
		y=20;
	}
	
	public TryMethod(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(x);
		System.out.println(y);
		
	}
	
	public void methodName1()
	{
		System.out.println("this is invoking method1");
		
	}
	
	public void methodName2()
	{
		System.out.println("this is invoking method2");
		
	}
	public void methodName3()
	{
		
		System.out.println("this is invoking  method3");

	}
	public static void print()
	{
		System.out.println("static invoked method");
		
	}
	public final static void printValue()
	{
		System.out.println("invoking final static method");
	}
	
}
