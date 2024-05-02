package jse.training.cocepts.collection.collections.concurent.iteratorfailures;

import java.util.ArrayList;
import java.util.Iterator;

public class Case1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
	  Iterator<Integer> iter=	list.iterator();
	  /*
	  //Reading and Removing condition   - Case 1
	  while(iter.hasNext())
	  {
		  System.out.println(iter.next());
		  list.remove(2);
	  }
	
	*/
	  /*
	  //Reading and Adding   - Case 2
	  while(iter.hasNext())
	  {
		  System.out.println(iter.next());
		  list.add(4);
	  }
		
	  */
//Reading and updating an arraylist - dont throw error  - Case -3 
	  /*
	  while(iter.hasNext())
	  {
		  System.out.println(iter.next());
		  list.set(2, 77);
		
	  }
	
	  /*
	  
	  Thread thread1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			  while(iter.hasNext())
			  {
				  System.out.println(iter.next());
				  list.set(2, 77);
				
			  }

			
		}
	});
	  
	  Thread thread2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				  while(iter.hasNext())
				  {
					  System.out.println(iter.next());
					  list.set(3, 87);
					
				  }

				
			}
		});
	  thread1.start();
	  thread2.start();
	  
	  */
	  
	  
	  while(iter.hasNext())
	  {
		 Integer val= iter.next();
		 System.out.println("Value"+val);
		  System.out.println(val);
		  if(val.equals(20))
		  {
			  list.remove(list.indexOf(20));
		  }
		
		
	  }
	  
	  System.out.println(list);
	}
}
