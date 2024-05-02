package jse.training.cocepts.threads.waitnotify;

public class WaitNotify  implements Runnable{
/*If same object shared by two Threads.
 * One Thread need to wait until completion of another thread
 * Suppose if one thread start execution for some time and need to wait that another 
 * thread completes it's execution.
 */


@Override
public void run() {
	
	if(Thread.currentThread().getName().equals("ThreadA"))
	{
		try {
			printThreadA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	if(Thread.currentThread().getName().equals("ThreadB"))
	{
		printThreadB();
	}
}


public void printThreadA() throws InterruptedException
{
	synchronized (this) {
		System.out.println("You are in Thead A method body");
		System.out.println("Moving Thread A to waiting state");
	   wait();
	   System.out.println("Completed the waiting state fo the thread");
	}
	
}

public void printThreadB()
{
	synchronized (this) {
		Thread.holdsLock(1000);
		System.out.println("You are in Thread B method boy");
		System.out.println("Thread B will be notifying below");
        notify();
		System.out.println("Thread B should complete the process before notifying");
	}
	
}
public static void main(String[] args) {
	WaitNotify obj=new WaitNotify();
	WaitNotify obj1=new WaitNotify();
	Thread th1=new Thread(obj, "ThreadA");
	Thread th2=new Thread(obj, "ThreadB");
	th1.start();
	th2.start();
}
}
