package jse.training.cocepts.threads.join;

public class Thread1 extends Thread {

	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName()+""+i);
		}
	}
}
