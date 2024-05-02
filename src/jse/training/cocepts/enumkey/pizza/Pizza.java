package jse.training.cocepts.enumkey.pizza;

public class Pizza {
	String description;
	Pizza(String description)
	{
		this.description=description;
	}
	
	public String getDetails()
	{
		return "You've ordered of Pizza size="+description;
	}
}
