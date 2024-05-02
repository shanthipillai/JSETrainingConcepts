package jse.training.cocepts.enumkey.pizza;

public class Order {
public static void main(String[] args) {
	Size size=Size.Medium;

		System.out.println(size.equals(Size.Large));
		System.out.println(size==Size.Large);
		System.out.println(size.hashCode());
		System.out.println(Size.Large.hashCode());
		System.out.println(Size.Large.ordinal()>Size.Small.ordinal());
	//Size.Large>Size.Small - not valid
	System.out.println(size.getPizzaOrder().getDetails());
}
}
