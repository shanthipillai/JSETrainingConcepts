package jse.training.cocepts.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;

public class NullChecks {
	//Iterating using for loop
	public static void getArrayListAndPrint(ArrayList<Integer> al)
	{
		for(int i=0;i<al.size();i++)
		{
			//al[i]->al.get(i)
			System.out.println(al.get(i));
		}
	}
	
	//Iterating using Advance for lopp
	public static void getArrayListAndPrint2(ArrayList<Integer> al)
	{
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}
	
	//Error Spot
	public static void getArrayListAndPrint2E(ArrayList<Integer> al)
	{
		for(int i:al)
		{
			System.out.println(i);
		}
	}
	//Iterating using Iterator
	public static void getArrayListAndPrint3(ArrayList<Integer> al)
	{
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
	
	
	
	//Iterating using List Iterator 
	public static void getArrayListAndPrint4(ArrayList<Integer> al)
	{
	ListIterator<Integer>itr=al.listIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	//List Iterator additional advantage
	System.out.println("Reverse Order");
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	}
	//Iterating using Java 8 Streams
	public static void getArrayListAndPrint5(ArrayList<Integer> al)
	{
	System.out.println("Java 8 Streams Concepts");
 al.stream().forEach(System.out::println);
 //System.out.println("Java 8 Streams REverse Order");
 //Error Spot
//	al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(100);
	list.add(null);
	list.add(1000);

	
	//System.out.println(list);
	
	
	
	NullChecks.getArrayListAndPrint(list);
	NullChecks.getArrayListAndPrint2(list);
	NullChecks.getArrayListAndPrint3(list);
	NullChecks.getArrayListAndPrint4(list);
	NullChecks.getArrayListAndPrint5(list);
	NullChecks.getArrayListAndPrint2E(list);
}
}
