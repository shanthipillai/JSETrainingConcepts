package jse.training.cocepts.threads.join;

import java.util.Timer;

public class LudoGameStart implements Runnable {
static int dice=0;
//static int player2dice=0;

//static int whotartsfirst=0;

	@Override
	public void run() {
	if(dice!=6)
	{
		if(Thread.currentThread().getName().equals("Player1"))
		{
			
			dice=(int)(Math.random()*7);
	         System.out.println(Thread.currentThread().getName()+" "+dice);

			
		  
		 
	         
		}
		
		if(Thread.currentThread().getName().equals("Player2"))
		{
			
			dice=(int)(Math.random()*7);
			   System.out.println(Thread.currentThread().getName()+" "+dice);
			   
			
		
		}		
		if(dice==6 )
		{
			
			System.out.println("Hurray !!!! "+Thread.currentThread().getName()+"  started the game first");
	        System.out.println("Game looks intresting!");
			
			/*	for (Thread t : Thread.getAllStackTraces().keySet()) 
			{  if (t.getState()==Thread.State.RUNNABLE) 
			     t.stop(); 
			}
			*/
		
			//Thread.interrupted();
	      
			
		}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		LudoGameStart obj=new LudoGameStart();
        Thread player1=new Thread(obj, "Player1");
		Thread player2=new Thread(obj, "Player2");
		
       player1.start();
       player1.join();
       player2.start();
      
	  
	}
}
