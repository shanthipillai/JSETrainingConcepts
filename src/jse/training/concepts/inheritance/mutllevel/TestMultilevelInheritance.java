package jse.training.concepts.inheritance.mutllevel;

public class TestMultilevelInheritance {

	public static void main(String[] args) {
		
		Child2 child2=new Child2();
		child2.child2Method();
		child2.childMethod();
		child2.parentMethod();
		child2.parentNewMethod();

		
		 Child1 child1 =new Child2();
		 child1.childMethod();
		 child1.parentMethod();
		 child1.parentNewMethod();
		 
		 
		 
	}

}
