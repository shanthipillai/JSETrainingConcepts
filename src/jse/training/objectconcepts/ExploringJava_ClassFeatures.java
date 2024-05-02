package jse.training.objectconcepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ExploringJava_ClassFeatures {
public static void main(String[] args) throws NoSuchFieldException, SecurityException {
	
	Class parent=jse.training.objectconcepts.Parent.class;   //Class.forName("Parent");
	Constructor[] con=parent.getConstructors();
	for(Constructor construct: con)
	{
		System.out.println(construct.getName());
		System.out.println(construct.getModifiers());
		//System.out.println(construct.getParameters().);
	}
	
	
	Field f[]=parent.getFields();
	Field i=parent.getField("x");
	System.out.println(i.toString());
	for(Field fl:f)
	{
		System.out.println("field"+f+fl.getName()+fl.getType());
	}
	
	
	
}
}
