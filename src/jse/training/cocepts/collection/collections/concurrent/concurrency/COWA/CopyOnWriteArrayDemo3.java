package jse.training.cocepts.collection.collections.concurrent.concurrency.COWA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;

public class CopyOnWriteArrayDemo3 {
public static void main(String[] args) throws InterruptedException {
	/*
	List<Integer> li4=Arrays.asList(2,3,4);
	li4.set(1, 15);
	System.out.println(li4);
	ArrayList<Integer> li1=new ArrayList<Integer>();
	li1.add(2);
	li1.add(3);
	li1.add(4);
	ArrayList<Integer> li2=new ArrayList<Integer>();
	li2.add(121);
	li2.add(13);
	li2.add(14);
	li2.add(5);

	//List<Integer> li2=Arrays.asList(121,13,14,5);
	
	Collections.copy(li2, li1);
	System.out.println(li2);
	List<Integer> li3=li2;
	System.out.println(li3);
	li3.add(6);
	Collections.copy(li2, li3);


	System.out.println(li2);
//	System.out.println(li3);
 * 	*/
 
	CopyOnWriteArrayList<String> coa=new CopyOnWriteArrayList<String>();
	coa.add("11-Main");
	coa.add("12-Main");
	coa.add("13-Main");
	coa.add("14-Main");
	coa.add("15-Main");

	Thread th1=new Thread(new Runnable() {
		
		@Override
		public void run() {
	for(int i=16;i<=20;i++)
	{
		System.out.println("Start="+coa+"="+Thread.currentThread().getName());
		coa.add(i+Thread.currentThread().getName());
		//System.out.println("End"+coa+"="+Thread.currentThread().getName());
		
	}
		}
	},"ThreadA");
	
	

	Thread th2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i=21;i<=25;i++)
			{
				System.out.println("Start="+coa+"="+Thread.currentThread().getName());
				coa.add(i+Thread.currentThread().getName());
			//	System.out.println("End"+coa+"="+Thread.currentThread().getName());
				
			}
			
		}
	},"ThreadB");
	th1.start();th2.start();
	th1.join();
	th2.join();
	
	coa.stream().forEach(System.out::println);
//	System.out.println(coa);
	
}
}
