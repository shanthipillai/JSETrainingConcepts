package jse.training.cocepts.threads.deamonthreads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DeamonThreads implements Runnable {

	@Override
	public void run() {
		System.out.println("In Run method");
		
	}

	public static void main(String[] args) {
		DeamonThreads obj1=new DeamonThreads();
		//Worker Thread 1
		Thread thread1=new Thread(obj1, "Thread1");
		//Worker Thread 2
		Thread thread2=new Thread(obj1, "Thread2");
		thread1.start();
		thread2.start();
		
		//Along with Main Threadsys
		
	Map<Thread, StackTraceElement[]>threads=	thread1.getAllStackTraces();
	   Set<Thread>th=	threads.keySet();
	  Iterator<Thread> itr = th.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next().getName());
	   }
		
	}
	
}
