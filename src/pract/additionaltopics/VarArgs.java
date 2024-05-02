package pract.additionaltopics;

public class VarArgs{
	int x[];
	VarArgs()
	{
		
	}

	VarArgs(int...x)
	{
		this.x=x;
		for(int prints:x)
		{
			System.out.println(prints);
			
		}
	}
	
		public void testVarArgs(int...x)
		{
			System.out.println("Varag int 1");
		System.out.println(x);
		for(int prints:x)
		{
		System.out.println(prints);
		}
		

		
		}
		
		public void testVarArgs(String s,int ... x)
		
		{
			System.out.println(s);
			
			System.out.println(x);
			for(int prints:x)
			{
				System.out.println(prints);
				
			}
		}
		public void testVarargs(int y,int...x)
		{
			System.out.println("Varag int 2");
		System.out.println(y);
		System.out.println(x);
		for(int prints:x)
		{
			System.out.println(prints);
		}
			}
		
		
	
	public static void main(String... args) {
		VarArgs va=new VarArgs();
		//VarArgs va=new VarArgs(11,22,33,44,55);
		
		//va.testVarArgs("java",10,20,30,40);
		va.testVarArgs(90,80,70,60,50);

	}

}
