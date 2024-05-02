package jse.training.cocepts.threads.executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class DefaultThreadDemo implements Runnable{

	@Override
	public void run() {
   System.out.println(Thread.currentThread().getName()+" executed");
		
	}

	
	public static void main(String[] args) {
	ThreadFactory threadFactory=	Executors.defaultThreadFactory();
	
	for(int i=0;i<5;i++)
	{
	Thread th=	threadFactory.newThread(new DefaultThreadDemo());
	th.setName("DefaultThread"+i);
	th.start();
	}
	}
}
