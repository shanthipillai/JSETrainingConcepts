package jse.training.cocepts.collection.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



public class VectorIteration {
	
	public static void forIteration(Vector<Integer> vector)
	{
		System.out.println("Traditional For Loop");
		for(int i=0;i<vector.size();i++)
		{
			System.out.println(vector.get(i));
		//	System.out.println(vector.elementAt(i));
		}
	}
	
	public static void advanceFor(Vector<Integer> vector)
	{
		System.out.println("Advance For Loop");
		for(int ival:vector)
		{
			System.out.println(ival);
		}
	}
	
	public static void forEachJ8(Vector<Integer> vector)
	{
		System.out.println("For Each Loop");
		vector.stream().forEach(System.out::println);
	}
	
	public static void iteration(Vector<Integer> vector)
	{
		System.out.println("Iteration");
		Iterator<Integer> iter=vector.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
	public static void listIteration(Vector<Integer> vector)
	{
		System.out.println("List Iteration");
		System.out.println(vector);
		ListIterator<Integer> iter=vector.listIterator();
		ListIterator<Integer> iter1=vector.listIterator(vector.size());
		
		while(iter1.hasPrevious())
		{
			System.out.println(iter1.previous());
		}
		
	}
	
	public static void enumerate(Vector<Integer> vector)
	{
		System.out.println("Enumeration");
	Enumeration<Integer> iter=	vector.elements();
	while(iter.hasMoreElements())
	{
		System.out.println(iter.nextElement());
	}
	}
public static void main(String[] args) {
Vector<Integer> vector=new Vector();
	
	vector.add(11);
	vector.add(12);
	vector.add(13);
	vector.add(14);
	vector.add(15);
	vector.add(15);
	
	VectorIteration.forIteration(vector);
	VectorIteration.advanceFor(vector);
	VectorIteration.forEachJ8(vector);
	VectorIteration.iteration(vector);
	VectorIteration.listIteration(vector);
	VectorIteration.enumerate(vector);
}
}
