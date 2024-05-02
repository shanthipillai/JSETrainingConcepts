package jse.training.cocepts.collection.set.HashSet.LinkedHS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {
/*
 * Insertion is preserved
 * Duplicates not allowed
 * Null values are allowed
 * Hashing+LinkeList 
 * 
 */
	public static void main(String[] args) {
	
    LinkedHashSet< Integer> set=new LinkedHashSet<Integer>();
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
     
	//Try all the remaining methods common with Collections
	}

}
