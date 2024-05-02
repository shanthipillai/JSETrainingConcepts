package jse.training.cocepts.additionaltopics;

public class CopyConstructorScenario2 {

	int x;
	int y;
	final int z;
	CopyConstructorScenario2()
	{
		z=0;
	}
	CopyConstructorScenario2(int xval,int yval, int zval)
	{
		x=xval;
		y=yval;
	    z=zval;
	}
	
	CopyConstructorScenario2(CopyConstructorScenario2 obj)
	{
		x=obj.x;
		y=obj.y;
		z=obj.z;
	}
	
	public static void main(String[] args) {
		CopyConstructorScenario2 obj1=new CopyConstructorScenario2();
	
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		
		CopyConstructorScenario2 obj2=new CopyConstructorScenario2(60,90,90);
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		System.out.println(obj2.z);
		//obj2.z=12;
		
		CopyConstructorScenario2 obj5=new CopyConstructorScenario2(70,900,50);
		
		CopyConstructorScenario2 obj3;
		obj3=obj2;;
           System.out.println(obj3.x);
		System.out.println(obj3.y);
		System.out.println(obj3.z);
		
		CopyConstructorScenario2 obj4=new CopyConstructorScenario2(obj5);
		System.out.println(obj4.x);
		System.out.println(obj4.y);
		System.out.println(obj4.z);
		
		

	}

}
