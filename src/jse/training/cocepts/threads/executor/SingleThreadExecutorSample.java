package jse.training.cocepts.threads.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutorSample implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(500);
			System.out.println(Thread.currentThread().getName()+"is executed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	
	public static void main(String[] args) {
	ExecutorService executor	=Executors.newSingleThreadExecutor();
	for(int i=0;i<10;i++)
	{
		executor.execute(new SingleThreadExecutorSample());
	}
	}

}
