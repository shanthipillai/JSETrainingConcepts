package jse.training.cocepts.encapsulation;

public class Test {
public static void main(String[] args) {
	NonEncapsulation obj=new NonEncapsulation();
//obj.x=10;
//	obj.y=20;
	

	obj.setX(10);
	obj.setY(11);
	obj.setS("Java");
	
	/*
	obj.s="hello world"+"\n"+"null";
	System.out.println(obj.s);
	
	obj.s="hello world"+obj.getDBConnection();
	System.out.println(obj.s);
	*/
}
}
