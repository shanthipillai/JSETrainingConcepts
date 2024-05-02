package jse.training.cocepts.constructors.booking;

public class BookingfromAnytoAny {
	String startingPoint;
	String destination;
	BookingfromAnytoAny(String fromLocation, String toLocation)
	{
		startingPoint=fromLocation;
		destination=toLocation;
		System.out.println("Ride has been initialized from location "+startingPoint+" tolocation "+destination);
	}
}
