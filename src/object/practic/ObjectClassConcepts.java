package object.practic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjectClassConcepts {
	

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		//  ObjectClassConcepts occ=new ObjectClassConcepts();
		TryMethod tm=new TryMethod();
		ParentPrivate pp=new ParentPrivate();
		//prints multiple method names
		Class<?> cls=Class.forName("java.lang.Object");
		Method[] m=cls.getDeclaredMethods();
		for(Method methd:m)
		{
			System.out.println(methd.getName().toString());
			
		}
	//prints single method name
		Method m1=cls.getDeclaredMethod("toString");
		System.out.println(m1);
		Method m2=cls.getDeclaredMethod("notify");
		System.out.println(m2);
		Method m3=cls.getDeclaredMethod("notifyAll");
		System.out.println(m3);
		Method m4=cls.getDeclaredMethod("clone");
		System.out.println(m4);
		/*Method m5=cls.getDeclaredMethod("equals");
		System.out.println(m5);*/ 
		
		
		Class<?> cls1=Class.forName("object.practic.TryMethod");
		Method[] mt=cls1.getDeclaredMethods();
		System.out.println("*******printing all methods of TryMethod class*******");
		for(Method mts:mt)
		{
			System.out.println(mts.getName());
		}
        System.out.println("****printing sinle method****");
		Method mt1=cls1.getDeclaredMethod("methodName2");
		
		System.out.println(mt1);
		
		System.out.println("***Invoking instance method***");
		Method md1=cls1.getMethod("methodName1");
		md1.invoke(tm);
		//invoking all methods
		System.out.println("***Invoking instance methods***");
		Method[] mth1=cls1.getDeclaredMethods();
		for(Method met:mth1)
		{
		System.out.println(met.invoke(tm));
		}
		
		Method md2=cls1.getMethod("methodName2");
		md2.invoke(tm);
		//invoking static method
		Method mh1=cls1.getMethod("print");
		mh1.invoke(tm);
		//invoking final static method
		Method mh2=cls1.getMethod("printValue");
		mh2.invoke(tm);
		
		
		//invoking private method
				
		Class<?> cls2=Class.forName("object.practic.ParentPrivate");
		Method mm1=cls2.getMethod("printValue");
		mm1.setAccessible(true);
		mm1.invoke(pp);
		
	}

}
