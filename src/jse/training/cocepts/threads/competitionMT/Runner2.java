package jse.training.cocepts.threads.competitionMT;

public class Runner2 extends Thread {

	 int target=100;
	   int startToTarget=0;
		public void run()
		{
			for(int i=0;i<50;i++)
			{
				
			     int achievedTarget=(int)Math.random()*6;
			     startToTarget=startToTarget+achievedTarget;
			     if(startToTarget>=100)
			     {
			    	 System.out.println("Congratulations" + Thread.currentThread().getName());
			    	 System.out.println("Target Achieved successfully");
			    	 break;
			     }
			}
		}
}
