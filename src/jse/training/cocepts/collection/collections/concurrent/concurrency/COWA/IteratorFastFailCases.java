package jse.training.cocepts.collection.collections.concurrent.concurrency.COWA;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorFastFailCases {
public static void main(String[] args) {
	
	ArrayList<String > al=new ArrayList<String>();
	al.add("test1");
	al.add("test2");
	al.add("test3");
	al.add("test4");
	
	Iterator<String> iter1=al.iterator();
	Iterator<String> iter2=al.iterator();
	
	while(iter1.hasNext())
	{
		iter1.remove();
	}
	
	
	while(iter2.hasNext())
	{
		iter2.remove();
	}
	
}
}
