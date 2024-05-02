package jse.training.cocepts.threads.executor;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecuterServiceSample  implements Runnable{
	private int id;
	ExecuterServiceSample(int id)
	{
		this.id=id;
	}
	@Override
	public void run() {
	
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		Thread.currentThread().interrupt();
		}
		
		System.out.println("Thread executed by" +Thread.currentThread().getName()+"for the"+id+"time");
	}

	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor=Executors.newFixedThreadPool(10);
		for(int i=0;i<100;i++)
		{
			executor.execute(new ExecuterServiceSample(i));
		}
		
executor.shutdown();
		try
		{
	if(!executor.awaitTermination(1000, TimeUnit.MILLISECONDS))
	{
		executor.shutdownNow();
	}
		}
		catch(InterruptedException ae)
		{
			executor.shutdownNow();
		}
	
	}
	
}
