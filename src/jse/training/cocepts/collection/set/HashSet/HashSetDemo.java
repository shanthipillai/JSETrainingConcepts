package jse.training.cocepts.collection.set.HashSet;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) throws ClassNotFoundException {
	/*
	 * Insertion Order not preserved
	 * Duplicates are not allowed 
	 * Null allowed but only once

	 */
		
		Class cls=Class.forName("java.util.TreeSet");
		
		Class[] cl=cls.getDeclaredClasses();
		for(Class c:cl)
		{
			System.out.println(c.getName());
		}
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(33);
		set.add(55);
		set.add(77);
		set.add(11);
		set.add(11);
		System.out.println(set);
		
		
		HashSet<String> stringset=new HashSet<String>();
		stringset.add("test1");
		stringset.add("test2");
		stringset.add("test3");
		stringset.add("test4");
		stringset.add("test1");
		stringset.add("");
		stringset.add("");
		System.out.println(stringset);
		
		
		
		//Try all the remaining methods common with other Collections
		


	}

}
