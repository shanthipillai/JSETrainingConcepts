package jse.training.cocepts.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;



public class IteratingLists {
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
	 System.out.println("Java 8 Streams REverse Order");
	 al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(11);
	al.add(12);
	al.add(13);
	al.add(41);
	al.add(71);
	IteratingLists.getArrayListAndPrint(al);
	IteratingLists.getArrayListAndPrint2(al);
	IteratingLists.getArrayListAndPrint3(al);
	IteratingLists.getArrayListAndPrint4(al);
	IteratingLists.getArrayListAndPrint5(al);
}
}
