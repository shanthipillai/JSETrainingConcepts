package jse.training.objectconcepts;

public class ObjectConcepts2 //extends Object 
{
	
	@Override
	public boolean equals(Object obj) {
	
		return super.equals(obj);
	}
	
	
	
//	int objId;
	String objName;
	/*
@Override
public String toString() {
	
	return  "Object Name=  "+objName;
	
}
	*/

	public static void main(String[] args) {
		ObjectConcepts2 obj=new ObjectConcepts2();
	//	obj.objId=12;
		obj.objName="Object1";
		ObjectConcepts2 obj1=new ObjectConcepts2();
		//obj1.objId=13;
		obj1.objName="Object2";
		ObjectConcepts2 obj3=obj1;
		
		System.out.println(obj.toString());
		System.out.println(obj1);
		System.out.println(obj3);
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj1.equals(obj3));
		
		
		String s1="Shyra";
		String s2="Shyra";
		
		System.out.println(s1.equals(s2));
		
	}
}
