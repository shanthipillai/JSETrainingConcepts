package jse.training.cocepts.collection.set.TreeSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;



public class IteratingSet {
	//Iterating using for loop
	//You can't iterate a HashSet like this to get the values
	/*
	public static void getSetAndPrint(HashSet<Integer> al)
	{
		for(int i=0;i<al.size();i++)
		{
			//al[i]->al.get(i)
			System.out.println(al.);
		}
	}
	*/
	//Iterating using Advance for lopp
	public static void getSetAndPrint2(Set<Integer> al)
	{
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}
	
	//Iterating using Iterator
	public static void getSetAndPrint3(Set<Integer> al)
	{
		
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
/*	
	//Iterating using List Iterator 
	public static void getSetAndPrint4(Set<Integer> al)
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
	*/
	//Iterating using Java 8 Streams
	public static void getSettAndPrint5(Set<Integer> al)
	{
	System.out.println("Java 8 Streams Concepts");
	 al.stream().forEach(System.out::println);
	 System.out.println("Java 8 Streams REverse Order");
	 al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
	
	
	public static void descendingTreeSet(TreeSet<Integer> set)
	{
		Iterator<Integer> desset=set.descendingIterator();
		while(desset.hasNext())
		{
			System.out.println(desset.next());
		}
	}
	public static void getSpecificIndexVal(int index, Set<Integer> set)
	{
		int head=0;
		for(Integer setval:set)
		{
			if(head==index)
			{
				System.out.println("Element at index"+index+"is="+setval);
			}
			head++;
		}
	}
	
public static void main(String[] args) {
	TreeSet<Integer> set=new TreeSet<Integer>();
	set.add(33);
	set.add(55);
	set.add(77);
	set.add(11);
	set.add(11);

	//IteratingSet.getSetAndPrint(set);
	IteratingSet.getSetAndPrint2(set);
	IteratingSet.getSetAndPrint3(set);
	//IteratingSet.getSetAndPrint4(set);
	IteratingSet.getSettAndPrint5(set);
	IteratingSet.getSpecificIndexVal(3, set);
	System.out.println("Descending Set");
	IteratingSet.descendingTreeSet(set);
}
}
