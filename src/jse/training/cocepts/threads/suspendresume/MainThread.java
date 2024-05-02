package jse.training.cocepts.threads.suspendresume;

public class MainThread {
public static void main(String[] args) throws InterruptedException {
	Thread1 th1=new Thread1();
	th1.setName("Thread1");
	Thread2 th2=new Thread2();
	th2.setName("Thread2");
	
	th1.start();
	th2.start();
//th1.join();
th2.join();

//System.out.println(th1.isAlive());


if(!th2.isAlive())
{
	//System.out.println("In Resume block");
	th1.resume();;
}
//System.out.println(th2.isAlive());
	th1.join();
System.out.println("Completed the Process");
}
}
