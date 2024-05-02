package jse.training.cocepts.accessmodifiers.exceptions;

import java.lang.reflect.Method;

import jdk.internal.org.objectweb.asm.tree.MethodNode;

public class ExceptionHandling2 {
public static void main(String[] args)  {
	Class cls;
	try
	{
		 cls=Class.forName("java.lang.Object");
		 try {
			Method m=cls.getDeclaredMethod("incorrect");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	catch(ClassNotFoundException e)
	{
		System.out.println(e);
	} 
	
	
	
	
}
}
