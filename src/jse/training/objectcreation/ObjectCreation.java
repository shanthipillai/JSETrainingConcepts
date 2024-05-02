package jse.training.objectcreation;

public class ObjectCreation {

	int x=10;
	public void print()
	{
		System.out.println(x);
	}
	public static void main(String[] args) {
		ObjectCreation object1=new ObjectCreation();
		System.out.println(object1);
		
		
		//System.out.println(new ObjectCreation() );
		//System.out.println(new ObjectCreation() );
		
		System.out.println(object1.x);
		object1.print();

	
	}
}
