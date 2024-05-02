package jse.training.thiskeyword;

public class NonStaticAndStatic2 {

	//NonStaticAndStatic2 this=new NonStaticAndStatic2();
	public void nonStaticMethod1()
	{
		System.out.println("nonStaticMethod1");
	}
	
	public void nonStaticMethod2()
	{
		this.nonStaticMethod1();
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
		
		NonStaticAndStatic2 obj1=new NonStaticAndStatic2();
		NonStaticAndStatic2 obj2=new NonStaticAndStatic2();
	}

}
