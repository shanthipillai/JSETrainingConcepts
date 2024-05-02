package jse.training.thiskeyword;

public class ThisAsMethodParameter {

	public void invokeThisMethod()
	{
		System.out.println("This method is from ThisAsMethodParameter class");
		ThisAsMethodParam obj=new ThisAsMethodParam();
		obj.getThisAsMethodParam(this);
		
	}
	
	public void printThisMethod()
	{
	    System.out.println("Print this method from ThisAsMethodParameter");
	}
	
	public static void main(String[] args) {
		ThisAsMethodParameter obj=new ThisAsMethodParameter();
		obj.invokeThisMethod();
	}

}
