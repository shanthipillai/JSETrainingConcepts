package jse.training.cocepts.collection.list.arraylist.queue.AQ;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
public static void main(String[] args) {
	//Created ArrayDequeue
ArrayDeque<Integer> queue	=new ArrayDeque<Integer>();
queue.add(23);
queue.add(100);
queue.add(80);
queue.add(98);
queue.add(98);
queue.add(2);

queue.remove();

System.out.println(queue);

queue.removeLast();
System.out.println(queue);

queue.removeFirst();
System.out.println(queue);
//Try all rest of methods in this class API

}

}
