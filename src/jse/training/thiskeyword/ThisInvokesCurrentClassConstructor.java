package jse.training.thiskeyword;

public class ThisInvokesCurrentClassConstructor {

	ThisInvokesCurrentClassConstructor()
	{
		System.out.println("Default Constructor");
	}
	
	ThisInvokesCurrentClassConstructor(int x, int y)
	{
		this();  //calls default constructor
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
	
		ThisInvokesCurrentClassConstructor obj=new ThisInvokesCurrentClassConstructor(12,18);
	}

}
