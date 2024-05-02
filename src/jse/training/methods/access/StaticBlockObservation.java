package jse.training.methods.access;

public class StaticBlockObservation {
static
{
	
	StaticBlockObservation obj=new StaticBlockObservation();
	obj.instance();
	test();
}


public static void test()
{
	System.out.println("Static Method");
}

public void instance()
{
	System.out.println("Instance Method");
}
public static void main(String[] args) {
	
	
}
}
