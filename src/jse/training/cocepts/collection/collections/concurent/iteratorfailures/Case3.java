package jse.training.cocepts.collection.collections.concurent.iteratorfailures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Case3 {
public static void main(String[] args) throws InterruptedException {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	 ListIterator<Integer> iter=	list.listIterator();
	 ListIterator<Integer> iter1=	list.listIterator();
	 
	
	  
	  Thread th1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			 while(iter.hasNext())
			  {
				 Integer val= iter.next();
				  System.out.println(val);
				  if(val==20)
				  {
					  iter.remove();
					
				  }
						
			  }
		 
			
		}
	},"ThreadA");
	  
	  
	  
	  Thread th2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				  while(iter1.hasNext())
				  {
					  
					 Integer val= iter1.next();
					  System.out.println(val);
					  System.out.println("Adding");
					  iter1.add(90);
							
				  }
				  
			 
				
			}
		},"ThreadB");
	  
	  th1.start();th2.start();
	  th1.join();th2.join();
	  System.out.println(list);
	
	  
}
}
