package jse.training.cocepts.threads.sleep;

public class SleepMethod extends Thread {

	public void run() 
	{
		/*
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			   //Thread.currentThread().stop();
			   System.out.println(e);
			}
	
		}	*/
		
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		SleepMethod obj=new SleepMethod();
		obj.start();
		obj.interrupt();

	}

}
