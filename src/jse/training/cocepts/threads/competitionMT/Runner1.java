package jse.training.cocepts.threads.competitionMT;

import java.util.ArrayList;

public class Runner1 extends Thread {
   int target=100;
   int startToTarget=0;
  static int state=0;
  String Winner="";
   ArrayList<String> al=new ArrayList<String>();
	public void run()
	{
		for(int i=0;i<50;i++)
		{
		     int achievedTarget=(int)(Math.random()*6);
		  //   System.out.println(achievedTarget);
		     
		     startToTarget=startToTarget+achievedTarget;
		    // System.out.println(Thread.currentThread().getName()+startToTarget);
		//  System.out.println("ArraySize"+al.size());
		     if(startToTarget>=100)
		     {
		        
		    		 System.out.println("Congratulations" + Thread.currentThread().getName());
		    		 System.out.println("Target Achieved successfully");
		    		 al.add(Thread.currentThread().getName());
		    	
		    		Thread.currentThread().stop();
		    	
		     }
		    	
		    	 
		    	 
		    	 
		    	 
		     }
		     
		}
	}

