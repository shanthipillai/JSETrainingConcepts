package jse.training.cocepts.threads.join;

public class ThreadJoin {
public static void main(String[] args) throws InterruptedException {
	Thread thread1=new Thread1();
	thread1.setName("ThreadA");
	Thread thread2=new Thread2();
	thread2.setName("ThreadB");
	thread1.start();
	
	thread1.join();
	thread2.start();
	System.out.println("Print main thread");

	
}
}
