package jse.training.cocepts.additionaltopics;

public class CopyConstuctorScenario1 {
	int x;
	int y;
	
	CopyConstuctorScenario1()
	{
	
	}
	CopyConstuctorScenario1(int x, int y)
	{
		this.x=x;
		this.y=y;
	
		
	}
public static void main(String[] args) {
	CopyConstuctorScenario1 obj1=new CopyConstuctorScenario1();
	System.out.println(obj1.x);
	System.out.println(obj1.y);
	CopyConstuctorScenario1 obj2copy1=new CopyConstuctorScenario1(200,30);
	System.out.println(obj2copy1.x);
	System.out.println(obj2copy1.y);
	
	CopyConstuctorScenario1 obj2copy2=new CopyConstuctorScenario1(700,30);
	System.out.println(obj2copy2.x);
	System.out.println(obj2copy2.y);
	
	 CopyConstuctorScenario1 obj3=obj2copy1;
	System.out.println(obj3.x);
	System.out.println(obj3.y);
	
	 obj3=obj2copy2;
	 System.out.println(obj3.x);
	System.out.println(obj3.y);
	
    
	
}
}
