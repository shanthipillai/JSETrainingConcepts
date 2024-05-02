package jse.training.cocepts.threads.join;

public class JoinScenario extends Thread {

	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" ="+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Printing ");
		JoinScenario obj1=new JoinScenario();
		obj1.setName("Thread1");
		
		JoinScenario obj2=new JoinScenario();
		obj2.setName("Thread2");
	
		
		obj2.start();
		obj2.join();
		obj1.start();
		
		
		
	/*	
		System.out.println("Main Thread"+Thread.currentThread().getName());
		
		System.out.println(obj1.getPriority());  //5
		System.out.println(obj2.getPriority());  //5
		System.out.println(Thread.currentThread().getPriority());  //5
		*/
	}
}
