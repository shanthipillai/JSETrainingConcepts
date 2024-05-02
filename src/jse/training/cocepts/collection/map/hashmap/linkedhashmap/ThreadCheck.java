package jse.training.cocepts.collection.map.hashmap.linkedhashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ThreadCheck {
	static	int count=0;
	public static void main(String[] args) throws InterruptedException {
	LinkedHashMap<Integer,Integer> al=new LinkedHashMap<Integer, Integer>();
	
	Map<Integer, Integer> map=Collections.synchronizedMap(al);
//	List<Integer> synchronizedcollections=	Collections.synchronizedList(al);
	//Collection- Interface
	//Collections -Class which has static methods 
	//Anonymous Inner Classes
	Runnable runobj=new Runnable() {

		@Override
		public void run() {
		for(int i=1;i<10;i++)
		{
			//try 
		//	al.put(i,i);
			//Observer the unsynchronized behavior of threads 
			map.put(i,i);
			System.out.println(Thread.currentThread().getName());
			count++;
		}
		}
	};

	Thread th1=new Thread(runobj);
	Thread th2=new Thread(runobj);
	th1.start();
	th2.start();
	th1.join();
	th2.join();
	System.out.println(count);
	System.out.println(map);

	}
}
