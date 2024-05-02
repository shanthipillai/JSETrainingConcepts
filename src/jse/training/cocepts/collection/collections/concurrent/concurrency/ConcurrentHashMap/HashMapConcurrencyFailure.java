package jse.training.cocepts.collection.collections.concurrent.concurrency.ConcurrentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcurrencyFailure {
public static void main(String[] args) {
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
}
}
