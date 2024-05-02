package jse.training.cocepts.collection.collections.concurrent.concurrency.ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
public static void main(String[] args) throws InterruptedException {
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	map.put("test1", 1);
	map.put("test2", 2);
	map.put("test3", 3);
	
	Thread th1=new Thread(new Runnable() {
		
		@Override
		public void run() {
		
			map.put("test4", 7);
		}
	},"TheadA");
	
	
	Thread th2=new Thread(new Runnable() {
		
		@Override
		
		
		public void run() {
		
			for(Map.Entry<String, Integer> val:map.entrySet())
			{
			//	System.out.println(val.getKey()+val.getValue());
			System.out.println(val.getKey()+val.getValue());
			map.remove("test1");
				//map.put("test8", 111);
			}
	
		
			
		}
	},"ThreadB");
	
th1.start();th2.start();	
th1.join();
th2.join();
System.out.println(map);
}


}
