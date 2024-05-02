package jse.training.cocepts.Singleton;

public class ConnectionSetup {
private static	ConnectionSetup connection;
	private ConnectionSetup()
	{
		
	}
	
	public static ConnectionSetup getInstance()
	{
		//Lazy loading
		if(connection==null)
		{
		connection=new ConnectionSetup();
		}
		return connection;
	}
	
	
}
