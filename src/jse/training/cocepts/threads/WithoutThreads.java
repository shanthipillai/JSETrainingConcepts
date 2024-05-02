package jse.training.cocepts.threads;

public class WithoutThreads {

	//Task1
	public void download()
	{
		System.out.println("File are being downloded ....");
	}
	
	//Task2
	public void copyFiles()
	{
		System.out.println("Copying Files is in process");
	}
	
	
	public static void main(String[] args) {
	
		WithoutThreads obj=new WithoutThreads(); //1
		obj.download();  //2
		obj.copyFiles();   //3
		
		System.out.println(Thread.currentThread().getName());

	}

}
