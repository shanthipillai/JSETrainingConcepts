package jse.training.finalkeyword;

public class Parent {
//Final variables value can be assigned at declaration time or at constructor level	
	final float p;
 static int s=10;
   int x=10_000;  //10000
   int y;
   
static
{
	s=20;
	
}
   
   Parent(int p)
   {
	this.p = p;
	   System.out.println(p);
   }
	
	
	public static void main(String[] args) {
		Parent obj=new Parent(10);
	
        Parent obj1=new Parent(20);
        
        obj.s=30;
        obj1.s=50;
    	System.out.println(obj.s);
        System.out.println(obj1.s);
		
	
	}

}
