package jse.training.statickey;

public class StaticVariable {
	
	//Defining a static variable
	static int classId=891234;
	//Instance Variable
	int x=20;
public static void main(String[] args) {
	
	
	StaticVariable obj1=new StaticVariable();
	StaticVariable obj2=new StaticVariable();
//	int xval=obj.x;
	System.out.println(obj1.x);
	
	System.out.println(StaticVariable.classId);
	System.out.println(obj1.classId);
	
	obj2.classId=984567;
	
	System.out.println(obj2.classId);
	System.out.println(obj1.classId);

}
}
