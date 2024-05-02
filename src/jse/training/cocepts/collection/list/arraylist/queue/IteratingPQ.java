package jse.training.cocepts.collection.list.arraylist.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;



public class IteratingPQ{
	
	
	//Iterating using Advance for lopp
	public static void getPriorityQueueAndPrint2(PriorityQueue<Integer> al)
	{
		System.out.println("Advance For loop");
		for(Integer i:al)
		{
			System.out.println(i);
		}
	}
	
	//Iterating using Iterator
	public static void getPriorityQueueAndPrint3(PriorityQueue<Integer> al)
	{
		System.out.println("I");
	Iterator<Integer>itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
	
	//Iterating using List Iterator 
	
	//Iterating using Java 8 Streams
	public static void getPriorityQueueAndPrint5(PriorityQueue<Integer> al)
	{
	System.out.println("Java 8 Streams Concepts");
	 al.stream().forEach(System.out::println);
	 System.out.println("Java 8 Streams REverse Order");
	 al.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	
public static void main(String[] args) {
	PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Comparator.reverseOrder());
	 
	queue.add(90);
	queue.add(87);
	queue.add(3);
	queue.add(3);
	queue.add(2);
	queue.add(11);
	//IteratingLists.getArrayListAndPrint(queue);
	IteratingPQ.getPriorityQueueAndPrint2(queue);
	IteratingPQ.getPriorityQueueAndPrint3(queue);
	
	IteratingPQ.getPriorityQueueAndPrint5(queue);
}
}
