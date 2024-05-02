package jse.training.cocepts.innerclasses.anonymous.threadrunnable;

public class ThreadClass implements Runnable {

	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName());
		
	}

}
