package jse.training.cocepts.threads;

import java.io.File;

public class FileReading implements Runnable {
File f;
	@Override
	public void run() {
     if(Thread.currentThread().getName().equals("ThreadA"))
     {
    	  f=new File("D:\\Project");
     }
     if(Thread.currentThread().getName().equals("ThreadB"))
     {
    	  f=new File("E:\\Compute");
     }
     
	  	String fileNames[]=f.list();
	  	
	  	for(String fileName:fileNames)
	  	{
	  		System.out.println("By"+Thread.currentThread().getName()+" "+fileName);
	  	}
     
	}

	
	public static void main(String[] args) {
		FileReading obj=new FileReading();
		Thread th1=new Thread(obj,"ThreadA");
		Thread th2=new Thread(obj, "ThreadB");
		th1.start();
		th2.start();
	}
}
