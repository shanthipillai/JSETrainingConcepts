package jse.training.cocepts.collection.map.hashtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ThreadCheck {
	static	int count=0;
	public static void main(String[] args) throws InterruptedException {
	Hashtable<Integer,Integer> al=new Hashtable<Integer, Integer>();
	

	Runnable runobj=new Runnable() {

		@Override
		public void run() {
		for(int i=1;i<10;i++)
		{
			al.put(i,i);
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
	System.out.println(al);

	}
}
