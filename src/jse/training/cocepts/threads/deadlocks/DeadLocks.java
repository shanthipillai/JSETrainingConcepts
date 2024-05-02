package jse.training.cocepts.threads.deadlocks;

public class DeadLocks implements Runnable {
	String lock1="lock1";
	String lock2="lock2";
	@Override
	public void run() {
	if(Thread.currentThread().getName().equals("ThreadA"))
{
    synchronized (lock1) {
		System.out.println("ThreadA acquired lock1");
		
		try {
			Thread.currentThread().sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
    
    synchronized (lock2) {
    	System.out.println("ThreadA acquired lock2");
		
	}
}
}	
	if(Thread.currentThread().getName().equals("ThreadB"))
	{
		synchronized (lock2) {
			System.out.println("ThreadB acquired lock2");
			try {
				Thread.currentThread().sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    
	    synchronized (lock1) {
	    	System.out.println("ThreadB acquired lock1");
			
		}
		}
	}
		
	}
	
	public static void main(String[] args) {
		DeadLocks dl=new DeadLocks();
		DeadLocks dd=new DeadLocks();
	    Thread th1=new Thread(dl,"ThreadA");
	    Thread th2=new Thread(dd,"ThreadB");
	    
	    th1.start();
	    th2.start();
	}

	
}
