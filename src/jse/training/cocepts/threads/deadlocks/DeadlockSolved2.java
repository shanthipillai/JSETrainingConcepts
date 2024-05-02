package jse.training.cocepts.threads.deadlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockSolved2 {

	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);
	
	public static void main(String[] args) {
		
		DeadlockSolved2 deadlock = new DeadlockSolved2();
		
		//Method Reference
		new Thread(() -> {
			try {
				deadlock.worker1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}, "worker1").start();
		new Thread(deadlock::worker2, "worker2").start();
	}
	
	public void worker1() throws InterruptedException {
		lock1.lock();
		System.out.println("Worker1 acquires the lock1...");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lock2.lock();
		Thread.sleep(500);
	    System.out.println("Worker1 acquires the lock2..");
	    lock1.unlock();
	    lock2.unlock();
	
	}
	
	public void worker2() {
		lock1.lock();
		System.out.println("Worker2 acquires the lock2...");
		lock2.lock();
		System.out.println("Worker2 acquires the lock1");
		lock1.unlock();
	    lock2.unlock();
		
		
		//ignore it if it's hard to understand after inner classes you can come again here
	    
	}
}
