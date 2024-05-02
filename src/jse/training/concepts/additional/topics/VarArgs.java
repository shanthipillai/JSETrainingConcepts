package jse.training.concepts.additional.topics;
/*Var-Args is used when you are not not sure no of parameters or size of the array.  
 * Infact the var-args is an array
 * var args representation in a method should be the first or last but not in the middle
 * It can be used as overloading as well as methods and constructors
 */
public class VarArgs {
	
	int x[];
	VarArgs()
	{
		
	}
	
	VarArgs(int ...x)
	{
		this.x=x;
		
		for(int prints:x)
		{
			System.out.println(prints);
		}
	}
	//Uncomment and understand what happens if this also exists in code
	/*
	public void testVarArgs(int ... x)
	{
		System.out.println(x);
		//or
		
		for(int print:x)
		{
			System.out.println(print);
		}
	}
*/
	
	public void testVarArgs(String s,int ... x)
	{
		System.out.println(x);
		//or
		System.out.println(s);
		for(int print:x)
		{
			System.out.println(print);
		}
	}
	
	public void testVarArgs(int s,int ... x)
	{
		System.out.println(x);
		//or
		System.out.println(s);
		for(int print:x)
		{
			System.out.println(print);
		}
	}
	
	//Why there is will error undestand the comments written first in this program above if we uncomment
	/*
	public void testVarArgs(String... s,int ... x)
	{
		System.out.println(x);
		//or
		System.out.println(s);
		for(int print:x)
		{
			System.out.println(print);
		}
	}
	*/
public static void main(String[] args) {
	VarArgs obj=new VarArgs();
	//VarArgs obj1=new VarArgs(190,20,34,55);
	
	obj.testVarArgs(1,2,3,45,67);
	//obj.testVarArgs("test", 1,2,3,4,5);
}
}
