package jse.training.cocepts.exceptions.finallykey;

public class FinallyKey {
	
	public static void exceptionTest()
	{
		//DB Connection open;
		try
		{
			int x=10/2;
		}
		
		catch(Exception e)
		{
			System.out.println("Exception raised");
		}
		finally
		{
			System.out.println("It will execute irrespective of your error");
		}
	}
	
	public static void main(String[] args) {
		FinallyKey.exceptionTest();
	}

}
