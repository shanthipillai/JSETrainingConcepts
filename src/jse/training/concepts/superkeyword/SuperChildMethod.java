package jse.training.concepts.superkeyword;

public class SuperChildMethod extends SuperMethod {
	int a=20;
@Override
	public void test() {
	System.out.println(super.a);
		// TODO Auto-generated method stub
		super.test();
	System.out.println("Child class test method");
	}
public static void main(String[] args) {
	SuperMethod obj=new SuperChildMethod();
	obj.test();
	System.out.println(obj.a);
}
}
