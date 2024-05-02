package jse.training.cocepts.threads;

import sun.applet.Main;

public class CounterThreads implements Runnable {
//This is will more discussed in Synchronized Concepts 
	//One value modified by various threads and the output is indeterministic 
	public static int counter=0;
	//Suppose T1 came first then T1 hold the lock
	//Class Level Lock
	public synchronized static void increment()
	{
		counter++;
	}
	
	//T1, T2 both comes here at a time
	@Override
	public void run() {
		for(int i=0;i<100;i++)
		{
	    increment();
	 
		}
		
		// System.out.println(counter);

	}
	
	
	public static void main(String[] args) throws InterruptedException {
		CounterThreads obj=new CounterThreads();
		Thread th1=new Thread(obj);
		Thread th2=new Thread(obj);
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		System.out.println(counter);
	//	StringBuffer
		
		
	}

}
