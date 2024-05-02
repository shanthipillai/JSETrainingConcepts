package jse.training.thiskeyword;

public class ThisInvokesCurrentClassMethod {

	
	public void instanceMethod1()
	{
		System.out.println("instanceMethod1");
	}
	
	public void instanceMethod2()
	{
		//this.instanceMethod1();
		instanceMethod1();
		System.out.println("instanceMethod2");
	}
	public static void main(String[] args) {
		ThisInvokesCurrentClassMethod obj=new ThisInvokesCurrentClassMethod();
		obj.instanceMethod2();

	}

}
