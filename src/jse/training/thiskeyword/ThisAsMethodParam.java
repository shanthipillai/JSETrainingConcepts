package jse.training.thiskeyword;

public class ThisAsMethodParam {
public void getThisAsMethodParam(ThisAsMethodParameter obj)
{
	System.out.println("You are in ThisAsMethodParam");
	obj.printThisMethod();
	
}

/*
public static void main(String[] args) {
	ThisAsMethodParam obj=new ThisAsMethodParam();
	obj.getThisAsMethodParam(new ThisAsMethodParameter());
	*/
}
	

