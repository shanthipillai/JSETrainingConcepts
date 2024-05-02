package jse.training.cocepts.collection.set.TreeSet;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * Ascending by default
	 * Duplicates are not allowed
	 * Null is allowed
	 */
	
public static void main(String[] args) {
	TreeSet<Integer> set=new TreeSet<Integer>();
	set.add(33);
	set.add(55);
	set.add(77);
	set.add(11);
	set.add(11);
	set.add(7);
	set.add(100);
	
	//set.descendingIterator();
	System.out.println(set);
	

	TreeSet<String> stringset=new TreeSet<String>();
	stringset.add("test1");
	stringset.add("test2");
	stringset.add("test3");
	stringset.add("test4");
	stringset.add("test1");
	stringset.add("");
	stringset.add("");
	System.out.println(stringset);
	
	NavigableSet<Integer> nset=set.descendingSet();
	System.out.println(nset);
	
	SortedSet<Integer> sset=nset.tailSet(33);
	System.out.println(sset);
	
	SortedSet<Integer> hset=nset.headSet(33);
	System.out.println(hset);
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println(set.higher(56));
	System.out.println(set.lower(55));
	System.out.println(set.ceiling(56));
	System.out.println(set.floor(78));
    
	//System.out.println(set.ceiling(56));
	
	//Try all the remaining methods common with Collections
	
}
}
