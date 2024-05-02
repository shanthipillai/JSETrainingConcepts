package jse.training.cocepts.threads.suspendresume;

public class Thread1 extends Thread{
	
	public void run()
	{
		int j=0;  //j=0
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+i);
		//	if(i>=5 & j==0)
			if(i==5)
			{
				
				Thread.currentThread().suspend();
				j++;  //j=1
				
			}
	
		}
	}

}
