package jse.training.cocepts.collection.collections.concurrent.concurrency.ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcurrencyFailure2 {
public static void main(String[] args) throws InterruptedException {
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	hm.put(1, 150);
	hm.put(2, 160);
	hm.put(3, 180);
	hm.put(4, 190);
	hm.put(5, 120);
	//Case 1- Concurrent Modification Exception 
	/* 
	for(Map.Entry<Integer, Integer> iter:hm.entrySet())
	{
		System.out.println(iter.getKey()+""+iter.getValue());
		hm.put(6, 130);
	}
	
	*/
	
	//Case 2- Concurrent Modification Exception 
	/*
	for(Map.Entry<Integer, Integer> iter:hm.entrySet())
	{
		System.out.println(iter.getKey()+""+iter.getValue());
		hm.remove(4);
	}
	*/
	//No error Case 
	/*
	for(Map.Entry<Integer, Integer> iter:hm.entrySet())
	{
		System.out.println(iter.getKey()+""+iter.getValue());
		hm.replace(2, 166);
	}
	
	*/
	
	
	System.out.println(hm);
	
	
	Thread th1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(Map.Entry<Integer, Integer> iter:hm.entrySet())
			{
				System.out.println(iter.getKey()+""+iter.getValue());
				
			}
			
		}
	});
	
	
Thread th2=new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(Map.Entry<Integer, Integer> iter:hm.entrySet())
			{
			//	System.out.println(iter.getKey()+""+iter.getValue());
				hm.put(8, 88);
			}
			
		}
	});

th1.start();th2.start();
th1.join();th2.join();
System.out.println(hm);
}
}
