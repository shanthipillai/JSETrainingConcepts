package jse.training.cocepts.threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreExecutor implements Runnable{
	int id;
	Semaphore sm=new Semaphore(5);
	SemaphoreExecutor(int id)
	{
		this.id=id;
	}
	@Override
	public void run() {
		try {
			sm.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	System.out.println(Thread.currentThread().getName()+"="+id);
	try {
		TimeUnit.SECONDS.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sm.release();	
	}
	
public static void main(String[] args) throws InterruptedException {
	ExecutorService executor=Executors.newFixedThreadPool(10);
	for(int i=0;i<100;i++)
	{
		executor.execute(new SemaphoreExecutor(i));
	}
	/*
	   executor.shutdown();
	   try
	   {
	   if(executor.awaitTermination(100, TimeUnit.MILLISECONDS))
	   {
		 executor.shutdownNow();
	   }
	   }
	   catch(InterruptedException ie)
	   {
		   //executor.shutdownNow();
	   }
	   */
}


}
