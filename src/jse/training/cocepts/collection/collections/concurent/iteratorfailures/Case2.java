package jse.training.cocepts.collection.collections.concurent.iteratorfailures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Case2 {
public static void main(String[] args) throws InterruptedException {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	 ListIterator<Integer> iter=	list.listIterator();
	 ListIterator<Integer> iter1=	list.listIterator();
	  while(iter.hasNext())
	  {
		 Integer val= iter.next();
		  System.out.println(val);
		  if(val==20)
		  {
			  iter.remove();
			
		  }
				
	  }
 
	  while(iter1.hasNext())
	  {
		  
		 Integer val= iter1.next();
		  System.out.println(val);
		  System.out.println("Adding");
		  iter1.add(90);
				
	  }
	  
	  
	 
	  System.out.println(list);
	
}
}
