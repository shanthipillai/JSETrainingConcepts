package jse.training.concepts.keywords;

public class ThisDemo extends ParentClss {
   int a;
   int b;
   int c;
   ThisDemo()
   {

	   super();
	   
   }
   
   ThisDemo(int a, int b)
   {
	   int aa=this.a;
	   int x=super.p;
   }
   
	public void test(int a, int b, int c)
	{
		
		
		this.a=a;
		this.b=b;
		this.c=c;
		int x=super.p;
		super.print();
	}
	public static void main(String[] args) {
	

	}

}
