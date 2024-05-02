package jse.training.cocepts.enumkey.pizza;

public enum Size {

	Small(new Pizza("Small")), Medium(new Pizza("Medium")), Large(new Pizza("Large"));
  Pizza pizza;
	Size(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza=pizza;
	}
	
	public Pizza getPizzaOrder()
	{
		return pizza;
	}
}
