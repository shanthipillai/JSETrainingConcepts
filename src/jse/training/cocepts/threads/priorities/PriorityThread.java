package jse.training.cocepts.threads.priorities;

public class PriorityThread extends Thread {

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		PriorityThread obj1=new PriorityThread();
		PriorityThread obj2=new PriorityThread();
		//1 to 10  (Min to Max)
	
		obj1.start();
		obj1.setPriority(3);
	
	
		obj2.start();
	//	obj2.setPriority(MAX_PRIORITY);
	//	obj2.setPriority(MIN_PRIORITY);
	//	obj2.setPriority(NORM_PRIORITY);
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
}
