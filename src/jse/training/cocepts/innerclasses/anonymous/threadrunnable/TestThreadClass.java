package jse.training.cocepts.innerclasses.anonymous.threadrunnable;

public class TestThreadClass {
public static void main(String[] args) {
	//Normal Approach
	/*
	ThreadClass th=new ThreadClass();
	Thread thread1=new Thread(th);
	thread1.start();
	*/

	
	
	/*
	//Anonymous Inner Class Approach
	
	Runnable robj=new Runnable() {
		
		@Override
		public void run() {
		System.out.println(Thread.currentThread().getName());
			
		}
	};
	
	Thread thread2=new Thread(robj);
	thread2.start();
*/	
	/*
	//Anonymous Inner Class within a Constructor or method
	Thread thread3=new Thread(
			 
			new Runnable() {
				
				@Override
				public void run() {
				System.out.println(Thread.currentThread().getName());
					
				}
			}
			
			
			);
	
	thread3.start();
	*/
	
	Thread thread4=new Thread()
			{
		      @Override
		         public void run()
		         {
		        	 System.out.println(Thread.currentThread().getName());
		         }
			};
	thread4.start();
}
}
