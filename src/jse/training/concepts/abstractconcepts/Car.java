package jse.training.concepts.abstractconcepts;

public  class Car extends Vehicle {

	@Override
	public void drive() {
	System.out.println("Car Drive");
		
	}

	@Override
	protected
	 void calculateMileage() {
		System.out.println("Mileage estimated");
		
	}
	


}
