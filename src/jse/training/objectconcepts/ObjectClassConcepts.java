package jse.training.objectconcepts;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jse.training.concepts.eclipseoverview.Parent;

public class ObjectClassConcepts {
	
	
	
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
   Parent parent=new Parent();
	ObjectClassConcepts obj=new ObjectClassConcepts();
	
   Class cls=	Class.forName("java.lang.Object");
   Method[] m=cls.getDeclaredMethods();
   Method m1=cls.getDeclaredMethod("toString");
  // System.out.println( m1);
   for(Method methods:m)
   {
	   System.out.println(methods.getName());
   }
   
   
   Class cls1=	Class.forName("jse.training.concepts.eclipseoverview.Parent");
	Method[] parentmethods=cls1.getDeclaredMethods();
	
	System.out.println("***************Printing All methods of the class***********");
	for(Method meth:parentmethods)
	{
		System.out.println(meth.getName());
	}
	
	System.out.println("**************Invoking Instance method*******************");
	Method min=cls1.getMethod("print");
	min.invoke(parent);
	
	System.out.println("********************Invoking Private method****************");
	Method minpr=cls1.getDeclaredMethod("printing");
	
	minpr.setAccessible(true);
	minpr.invoke(parent);
	
	System.out.println("Other way");
	System.out.println("###############################################");
	//Other way instand Class.forName()
	
	Class cls2=java.lang.Object.class;
	Method mth[]=cls2.getDeclaredMethods();
	for(Method mt:mth)
	{
		System.out.println(mt.getName());
	}
	
}
}
