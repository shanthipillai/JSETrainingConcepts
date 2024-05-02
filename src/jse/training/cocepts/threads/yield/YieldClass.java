package jse.training.cocepts.threads.yield;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class YieldClass  implements Runnable{
	static Thread th1;
   static Thread mainThread;
@Override
public void run() {
synchronized (this) {
	
	Map<Thread, StackTraceElement[]> stackrace=Thread.getAllStackTraces();
	Set<Thread> threads=stackrace.keySet();
	Iterator<Thread> th=threads.iterator();
	int j=1;
	while(th.hasNext())
	{ 
	
		System.out.println("Thread"+j+th.next().getName());
		j++;
	}
	
	
	for(int i=0;i<=100;i++)
	{
		
		
		
	/*		//Thread.currentThread().yield();
		  if(i>50)
		  {
			  Thread.currentThread().yield();
		  }
		  
		*/  
		
		
		while(i>50  && mainThread.isAlive())
		{
			Thread.currentThread().suspend();
		}
		} 
		
	}
}


public static void main(String[] args) throws InterruptedException {
	YieldClass obj=new YieldClass();
	
	
	mainThread=Thread.currentThread();
 th1=new Thread(obj,"Thread0");
	//Thread th2=new Thread(obj,"Thread1");
	
	th1.start();
	
	//th1.join();
	//th2.start();
	
	for(int i=0;i<=100;i++)
	{
		System.out.println(Thread.currentThread().getName()+i);
	}
	
	
}

}
