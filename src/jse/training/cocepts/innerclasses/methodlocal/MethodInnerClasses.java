package jse.training.cocepts.innerclasses.methodlocal;

public class MethodInnerClasses {
  int z=20;
  int x=30;
	//Writing an Inner Class Inside a Method
	//Starting of Method
	public void printDetails()
	{
		int x=10;
		//Inner Class
		class Inner
		{
			int x=50;
			  public void printInnerMethod()
			  {
				  int x=20;
				
				  System.out.println(z);
				  System.out.println("You are invoking Inner Clas Method from Outer class method");
			  }
				
				
		}

		//End Inner Class
		Inner in=new Inner();
		in.printInnerMethod();
	}
	//End of Method
	
	public static void main(String[] args) {
		MethodInnerClasses obj=new MethodInnerClasses();
		obj.printDetails();
	}
}
