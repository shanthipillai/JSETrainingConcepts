package jse.training.cocepts.threads.deamonthreads;


 class WorkerThread implements Runnable
{
	public void run()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Worker thread is executing");
	}
}
 
 class DaemonThread implements Runnable
 {
	 public void run()
		{
			while(true)
			{
				try {
					Thread.currentThread().sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Daemon thread is executing...");
			}
		}
 }
 
 
public class MainThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread th1=new Thread(new DaemonThread());
		Thread th2=new Thread(new WorkerThread());
		th1.setDaemon(true);
		System.out.println(th1.isDaemon());
		th1.start();
		th2.start();
		th1.join();
		//th2.join();
		System.out.println("Main thread executing");
	}
	
	
}

