package jse.training.cocepts.collection.collections.concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Observation
{
	
	
public static void main(String[] args) {
	ArrayList<Integer> mainlist=new ArrayList<Integer>();
	mainlist.ensureCapacity(30);
	mainlist.add(10);
	mainlist.add(20);
	mainlist.add(30);
	mainlist.add(40);
	mainlist.add(50);
 
	
	System.out.println(mainlist);
	
	ArrayList<Integer> copy1=new ArrayList<Integer>(mainlist);
	ArrayList<Integer> copy2=new ArrayList<Integer>(mainlist);
	copy1.ensureCapacity(10);
	copy2.ensureCapacity(10);
	copy1.add(60);
	copy2.add(70);


	System.out.println(copy1);
	System.out.println(copy2);
	
	Collections.copy(mainlist, copy1);
	System.out.println(mainlist);
	
	Collections.copy(mainlist, copy2);
	System.out.println(mainlist);
}
}
