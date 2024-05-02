package jse.training.thiskeyword;

public class NonStaticAndStatic {

	
	public void nonStaticMethod1()
	{
		System.out.println("nonStaticMethod1");
	}
	
	public void nonStaticMethod2()
	{
		staticMethod1();
		nonStaticMethod1();
		System.out.println("nonStaticMethod2");
	}
	
	
	
	public static void staticMethod1()
	{
		System.out.println("staticMethod1");
	}
	
	public static void staticMethod2()
	{
		staticMethod1();
		System.out.println("staticMethod2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
