package jse.training.cocepts.Singleton;

public class Test {
public static void main(String[] args) {
	ConnectionDB con1=new ConnectionDB();
	System.out.println(con1);
	
	ConnectionDB con2=new ConnectionDB();
	System.out.println(con2);
	
	System.out.println(new ConnectionDB());
}
}
