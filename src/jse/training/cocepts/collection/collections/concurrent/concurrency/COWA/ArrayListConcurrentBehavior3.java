package jse.training.cocepts.collection.collections.concurrent.concurrency.COWA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListConcurrentBehavior3 {

	
	public static void main(String[] args) {
	
		List<Integer>li=Arrays.asList(1,2,3,4,5);
		//Can't add but you can only modify the elements
	//	li.add(10);
	//	System.out.println(li);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
	Iterator<Integer> iter	=al.iterator();
	Thread th1=new Thread(new Runnable() {
		
		@Override
		public void run() {
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
			
		}
	},"ThreadA");
	
	
Thread th2=new Thread(new Runnable() {
		
		@Override
		public void run() {
		
			al.add(45);
			
		}
	},"ThreadB");

th1.start();th2.start();
	}
}

