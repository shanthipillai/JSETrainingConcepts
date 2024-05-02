package jse.training.cocepts.innerclasses.regularinnerclass;

public class CompanyTesting {

	public static void main(String[] args) {
		Car car=new Car();
		Car.Engine engine=car.new Engine();
		engine.printEngineDetails();

	}

}
