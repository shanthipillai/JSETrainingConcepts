package jse.training.cocepts.threads.competitionMT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

public class Tournment {

	public static void main(String[] args) {
		//Pattern pattern=Pattern.compile("[0-20]");
		/*
		HashSet<Integer> hs=new HashSet<Integer>();
      for(int i=0;i<20;i++)
      {
    	  int no=(int) (Math.random()*100);
    	// System.out.println((int)(Math.random()*100));
    	 hs.add(no);

      }
      
  Iterator<Integer>iter=    hs.iterator();
  while(iter.hasNext())
  {
	  System.out.println(iter.next());
  }
	}
*/
		//Runner1 runner1=new Runner1();
		Thread thread1=new Runner1();
		thread1.setName("Thread1");
		Thread thread2=new Runner1();
		thread2.setName("Thread2");
		
		thread1.start();
		thread2.start();
		
		
	}
}
