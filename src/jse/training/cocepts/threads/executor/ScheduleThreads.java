package jse.training.cocepts.threads.executor;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ScheduleThreads implements Runnable{
	int id;
	//Semaphore sm=new Semaphore(10);
	
	@Override
	public void run() {
		LocalDateTime dateTime=LocalDateTime.now();
		//System.out.println("Downloading and Updating the stock every 5 seconds");
		System.out.printf("Schedule ran on %d-%d-%d at %d hr : %d min : %d secs \n", dateTime.getYear(),dateTime.getMonthValue(),dateTime.getDayOfMonth(),dateTime.getHour(), dateTime.getMinute(),dateTime.getSecond());
	}
	
public static void main(String[] args) {
	ScheduledExecutorService executor=Executors.newScheduledThreadPool(1);
	
		executor.scheduleAtFixedRate(new ScheduleThreads(), 1000, 5000,TimeUnit.MILLISECONDS);
		

   
}


}
