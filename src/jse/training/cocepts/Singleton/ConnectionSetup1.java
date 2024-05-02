package jse.training.cocepts.Singleton;

public class ConnectionSetup1 {
	//Eager Binding or Loading
	private static	 ConnectionSetup1 connection=new ConnectionSetup1();
	private ConnectionSetup1()
	{
		
	}
	
	public static ConnectionSetup1 getInstance()
	{
	
	  return connection;
	}
}
