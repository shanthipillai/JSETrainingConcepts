package jse.training.thiskeyword;

public class ThisAsConstructorArguments {

	ThisAsConstructorArguments()
	{
		System.out.println("You are in ThisAsConstructorArguments class's constructor ");
		ThisAsConsructorArgs obj=new ThisAsConsructorArgs(this);
	}
	
	public void print()
	{
		System.out.println("Print this method");
	}
	
	public static void main(String[] args) {
		ThisAsConstructorArguments obj=new ThisAsConstructorArguments();
		
	}
}
