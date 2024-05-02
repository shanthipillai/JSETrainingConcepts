package jse.training.concepts.inheritance.objcreation;

public class VarArgsTest {
	//Var -Args
	public void testMethod(int ...s)
	{
	  for(int val:s)
	  {
		  System.out.println(val);
	  }
	}

	public static void main(String[] args) {
		VarArgsTest obj=new VarArgsTest();
		obj.testMethod(1,2,3,4,5);
	}
}
