package jse.training.finalclass.finalmethods;

public class Child //extends FinalClassWithMethods 
{
public static void main(String[] args) {
	
	//FinalClassWithMethods is restricting user in extend or inhering also restricting a few method from overridden  but you can create object and access remaining
	FinalClassWithMethods obj=new FinalClassWithMethods();
	obj.alloweOveride();
	FinalClassWithMethods.useStaticMethodOfThisClass();
}
}
