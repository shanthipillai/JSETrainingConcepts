package jse.training.cocepts.collection.list.arraylist.queue.AQ;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;



public class IteratingAD{
	//Iterating using for loop
	
	//Iterating using Advance for lopp
	public static void getArrayListAndPrint2(ArrayDeque<Integer> al)
	{
		System.out.println("For Each Loop");
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}
	
	//Iterating using Iterator
	public static void getArrayListAndPrint3(ArrayDeque<Integer> al)
	{
		System.out.println("Iterator");
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
	
	//Iterating using List Iterator 
	
	
	//Iterating using Java 8 Streams
	public static void getArrayListAndPrint5(ArrayDeque<Integer> al)
	{
	System.out.println("Java 8 Streams Concepts");
	 al.stream().forEach(System.out::println);
	 System.out.println("Java 8 Streams REverse Order");
	 al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
public static void main(String[] args) {
	ArrayDeque<Integer> al=new ArrayDeque<Integer>();
	al.add(11);
	al.add(12);
	al.add(13);
	al.add(41);
	al.add(71);
	
	IteratingAD.getArrayListAndPrint2(al);
	IteratingAD.getArrayListAndPrint3(al);

	IteratingAD.getArrayListAndPrint5(al);
}
}
