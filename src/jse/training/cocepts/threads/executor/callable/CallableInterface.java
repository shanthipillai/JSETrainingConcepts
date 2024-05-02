package jse.training.cocepts.threads.executor.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterface implements Callable<String> {
	private int id;
	CallableInterface(int id)
	{
		this.id=id; //1,2,3,4
	}
	@Override
	public String call() throws Exception {
	Thread.sleep(1000);
		return "Id"+id;  //id1,id2,id3,id4
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Created Two threads
		ExecutorService service=Executors.newFixedThreadPool(2);
		String[] ids=new String[5];
		for(int i=0;i<5;i++)
		{
		String value=service.submit(new CallableInterface(i)).get(); //id1,id2,id3,id4
		ids[i]=value;
		}
		
		
		for(String id:ids)
		{
			System.out.println("Id returned "+id);
		}
	}
}
