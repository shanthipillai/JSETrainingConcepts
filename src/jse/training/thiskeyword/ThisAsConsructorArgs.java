package jse.training.thiskeyword;

public class ThisAsConsructorArgs {
	ThisAsConsructorArgs(ThisAsConstructorArguments obj)
	{
		System.out.println("You are in ThisAsConstructorArgs class's constructor ");
		obj.print();
	}
	
}
