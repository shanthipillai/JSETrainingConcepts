package jse.training.cocepts.collection.list.arraylist.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
	
	//FIFO
//PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
	PriorityQueue<Integer> queue=new PriorityQueue<Integer>(Comparator.reverseOrder());
 
	queue.add(90);
	queue.add(87);
	queue.add(3);
	queue.add(3);
	queue.add(2);
	queue.add(11);
	System.out.println(queue);
	
	
Iterator<Integer>iter=	queue.iterator();
while(iter.hasNext())
{
	System.out.println(iter.next());
}
queue.poll();
System.out.println(queue);;

queue.poll();
System.out.println(queue);

queue.poll();
System.out.println(queue);

//Try all rest of methods in this class API


}

}
