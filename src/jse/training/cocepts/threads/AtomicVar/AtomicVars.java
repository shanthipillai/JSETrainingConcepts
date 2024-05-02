package jse.training.cocepts.threads.AtomicVar;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVars implements Runnable {
static AtomicInteger counter=new AtomicInteger(0);
//static int counter=0;
//counter++;

	@Override
	public void run() {
	
		increment();
	}
	
	public void increment()
	{
		for(int i=0;i<100;i++)
		{
		counter.getAndIncrement();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		AtomicVars obj=new AtomicVars();
		Thread th1=new Thread(obj, "ThreadA");
		Thread th2=new Thread(obj, "ThreadB");
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		
		System.out.println(counter);
	}
}
