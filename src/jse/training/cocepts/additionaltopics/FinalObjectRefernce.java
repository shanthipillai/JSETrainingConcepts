package jse.training.cocepts.additionaltopics;

public class FinalObjectRefernce {

	public static void main(String[] args) {
	final FinalObjectRefernce obj1=new FinalObjectRefernce();
	FinalObjectRefernce obj2=new FinalObjectRefernce();
	//The below is not acceptable;as obj1 is final reassigning is not possible. 
	//obj1=obj2;
	
	obj2=obj1;
	
	}

}
