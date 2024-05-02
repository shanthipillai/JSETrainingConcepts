package jse.training.cocepts.collection.list.vector.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;



public class StackIterations {
	
	public static void traditionalForLoop(Stack<Integer> stack)
	{
		for(int i=0;i<stack.size();i++)
		{
			System.out.println(stack.get(i));
		
		}
	}
	public static void advanceForLoop(Stack<Integer> stack)
	{
		for(int vals:stack)
		{
			System.out.println(vals);
		}
	}
	
	public static  void java8ForLoop(Stack<Integer> stack)
	{
		stack.stream().forEach(System.out::println);
	}
	
	public static void iteratorloop(Stack stack)
	{
		Iterator<Integer>iter=stack.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
	public static void listIteratorloop(Stack<Integer> stack)
	{
	ListIterator<Integer>	iter=stack.listIterator(stack.size());
	while(iter.hasPrevious())
	{
		System.out.println(iter.previous());
	}
	}
	
	public static void enumerate(Stack<Integer> stack)
	{
	
		Enumeration<Integer> enumerate=stack.elements();
		while(enumerate.hasMoreElements())
		{
			System.out.println(enumerate.nextElement());
		}
	}
	

	
	
public static void main(String[] args) {
	 Stack<Integer> stack=new Stack<Integer>();
     stack.add(11);
     stack.add(12);
     stack.add(122);
     stack.add(112);
     stack.add(172);
     stack.add(172);
     System.out.println("For Loop");
     StackIterations.traditionalForLoop(stack);
     System.out.println("Advance For Loop");
     StackIterations.advanceForLoop(stack);
     System.out.println("Java8 For Loop");
     StackIterations.java8ForLoop(stack);
     System.out.println("Iterator");
     StackIterations.iteratorloop(stack);
     System.out.println("List Iterator");
     StackIterations.listIteratorloop(stack);
     System.out.println("Enumerator");
     StackIterations.enumerate(stack);
}
}
