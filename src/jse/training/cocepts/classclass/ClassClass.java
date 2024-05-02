package jse.training.cocepts.classclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import com.sun.xml.internal.ws.encoding.soap.SerializationException;

public class ClassClass {
	
	public int x;
	public int y;
	private int  z;
	ClassClass()
	{
		System.out.println("Default Constructor");
	}
	
	
	ClassClass(Object obj)
	{
		System.out.println("Parameterized Constructor");
		
	}
	
	private void classPrivateMethod()
	{
		System.out.println("Private Method");
	}
	
	public void classInstanceMethod()
	{
		System.out.println("Instance Method");
	}
	
	public static void classStaticMethod()
	{
		System.out.println("Static Method");
	}
	
	public final void classFinalMethod()
	{
		System.out.println("Final Method");
		
	}
//My method	
	public void getDecalredConstructs(Class object)
	{
		//Utilizing Java API 
		Constructor conts[]= object.getDeclaredConstructors();
		for(Constructor cons:conts)
		{
			
			 System.out.println(cons.toString());
			
		}
	}
	
	//My method
	public void getDeclaredMethod(Class object)
	{
		Method methods[]=object.getDeclaredMethods();
		for(Method method:methods)
		{
			System.out.println(method.getName());
		}
	}
	
	public void getDeclaredFields(Class object)
	{
	Field[] fs	=object.getDeclaredFields();
		for(Field f:fs)
		{
			System.out.println(f+"   "+f.getModifiers() +"   "+f.getType() +""+f.getGenericType());
			//System.out.println(f.getModifiers());
		}
	}
	
	
	public void getMethods(Class object)
	{
		Method methods[]=object.getMethods();
		for(Method method:methods)
		{
			System.out.println(method.getName());
		}
	}
	
	public void getCosntructors(Class object) throws NoSuchMethodException, SecurityException
	{
	       Constructor consstruct= object.getDeclaredConstructor(null);
	      Object obj = null;
	       Class[] para= (Class[]) obj;
	       Constructor consstruct2= object.getDeclaredConstructor(para);
	      
	       System.out.println(consstruct.toString()+"Hey You");
	       System.out.println(consstruct2.toString()+"Hey You Again");
		Constructor constructors[]=object.getConstructors();
		for(Constructor constructor:constructors)
		{
			System.out.println(constructor.toString());
		}
	}
	
	public void invokePrivateMethods(Class object, Object obj) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		ClassClass clsobj=(ClassClass) obj;
		Method method=object.getDeclaredMethod("classPrivateMethod");
		method.setAccessible(true);
		method.invoke(clsobj);
	}
	
	public void invokeMethods(Class object,Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		ClassClass clsobj=(ClassClass) obj;
		Method method=object.getDeclaredMethod("classInstanceMethod");
		method.invoke(obj);
	}
	
	public void getFields(Class object)
	{
		
		Field fields[]=object.getFields();
		 System.out.println("Fields of myClass: "
                 + Arrays.toString(
                		 object.getFields()));
		 
		
		
	}

	
}
