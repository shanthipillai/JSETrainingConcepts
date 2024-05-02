package jse.training.cocepts.threads.waitnotify;





public class AutomateLudoStart implements Runnable {

	   int dice=0;
	@Override
	public void run() {
		while(dice!=6)
		{
			
				if(Thread.currentThread().getName().equals("Player1"))
				{
					synchronized (this) {
						
					
				dice	=(int)(Math.random()*7);
				System.out.println(Thread.currentThread().getName()+" "+dice);
				if(dice!=6)
				{
					try {
						//Thread.currentThread().wait();
						notify();
			             wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				else
				{
					System.out.println(Thread.currentThread().getName()+"  "+"started");
					notify();
					Thread.interrupted();
				}
					}
				}
				if(Thread.currentThread().getName().equals("Player2"))
				{
					synchronized (this) {
					dice	=(int)(Math.random()*7);
					System.out.println(Thread.currentThread().getName()+" "+dice);
					if(dice!=6)
					{
						
			         notify();
			         try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						//Thread.currentThread().yield();
					}
					
					else
					{
						System.out.println(Thread.currentThread().getName()+"  "+"started");
						notify();
						Thread.interrupted();
					}
				}
			}
			}
		}	
		
	
    
	
	
	public static void main(String[] args) throws InterruptedException {
		AutomateLudoStart obj=new AutomateLudoStart();
	//	AutomateLudoStart obj1=new AutomateLudoStart();
		Thread player1=new Thread(obj,"Player1");
		Thread player2=new Thread(obj,"Player2");
		
		player1.start();
		
		player2.start();
		
		
		
		
	}
}
