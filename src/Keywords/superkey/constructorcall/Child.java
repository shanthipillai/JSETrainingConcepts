package Keywords.superkey.constructorcall;

public class Child extends Parent {
	Child()
	{
		super();
	}
	
	//Parameterized Constructor
	Child(int x)
	{
		super(1);
		System.out.println("Parameterized Constructor");
	}
	public static void main(String[] args) {
		
		
		Child c=new Child(1);
	}
}
