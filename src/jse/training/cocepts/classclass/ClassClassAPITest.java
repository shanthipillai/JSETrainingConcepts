package jse.training.cocepts.classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassClassAPITest {
	public static void printClasses() throws ClassNotFoundException 
	{
		
		  Class cls= Class.forName("jse.training.cocepts.classclass");
		Method methods []=  cls.getDeclaredMethods();
		for(Method m:methods)
		{
			System.out.println(m.getName());
		}
		
	}
	
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	ClassClass obj=new ClassClass();
	
	//Way-1
	Class obj1=obj.getClass();
	
	//Way-2
	Class obj2=Class.forName("jse.training.cocepts.classclass.ClassClass");
	
	//Way-3
	
	Class obj3=jse.training.cocepts.classclass.ClassClass.class;
	System.out.println("**********************getDeclaredConstructors Call*********************");
	obj.getDecalredConstructs(obj2);
	
	System.out.println("**********************getDeclared Method Call*********************");
	obj.getDeclaredMethod(obj3);
	
	System.out.println("**********************getDeclared Fields Call*********************");
	obj.getDeclaredFields(obj2);
	//printClasses();
  System.out.println(obj2.getPackage());
  
  
  System.out.println("**********************getMethod Call*********************");
  obj.getMethods(obj2);

  System.out.println("**********************getConstructor Call*********************");
  obj.getCosntructors(obj2);

  System.out.println("**********************Invoking Private Method of Class*********************");
  obj.invokePrivateMethods(obj3, obj);
  
 // obj.invokeMethods(obj3, obj);
  System.out.println("**********************Invoking Instance Method of Class*********************");
  obj.invokeMethods(obj3, obj);
  
   System.out.println(obj2.getPackage());
   
   obj.getFields(obj2);
   
   
   Class obj4=jse.training.cocepts.classclass.ClassImpl.class;

}
}
