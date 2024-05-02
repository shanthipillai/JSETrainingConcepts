package jse.training.cocepts.innerclasses.regularinnerclass;

public class Car {
String color;
String brand;
String model;
int registrationId;
int registeredNo;
private int confidential;
//Inner Class Starting
protected	 class Engine
	 {
		   String engineQuality;
		   String brand;
		   String service;
		   int manfacturingDate;
		   private String engineConfidentialCustomer;
		   
		public Engine() {
			// TODO Auto-generated constructor stub
		}

		public   void printEngineDetails()
		   {
			   System.out.println("engineQuality"+engineQuality);
			   System.out.println("brand"+brand);
			   System.out.println("service"+service);
			   System.out.println("manfacturingDate"+manfacturingDate);
			   printCarDetails();
		   }
	 }
	

//Inner Class Ending

//Outer Class method
public void printCarDetails()
{
	 System.out.println("color"+color);
	   System.out.println("brand"+brand);
	   System.out.println("model"+model);
	   System.out.println("registrationId"+registrationId);
	   System.out.println("registeredNo"+registeredNo);
	   System.out.println("Confidencial Details"+confidential);
}

//Outer Class Main Method
public static void main(String[] args) {
	//Outer Class Object Creation
	Car car=new Car();
	//Printing Outer Class properties
	System.out.println("Outer Class Properties");
	System.out.println(car.brand);
	System.out.println(car.color);
	System.out.println(car.model);
	System.out.println(car.registeredNo);
	System.out.println(car.registrationId);
	System.out.println("End Of Outer Class Properties");
//Inner Class Object Creation
	Car.Engine engine=car.new Engine();
	engine.printEngineDetails();
	
	System.out.println("Inner Class Properties");
	System.out.println(engine.brand);
	System.out.println(engine.service);
	System.out.println(engine.manfacturingDate);
	System.out.println(engine.engineConfidentialCustomer);
	System.out.println(engine.manfacturingDate);
	System.out.println("End of Inner Class Properties");
	//engine.engineConfidentialCustomer="confidential";
	//car.printCarDetails();
}
}
