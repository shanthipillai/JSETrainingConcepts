package jse.training.cocepts.innerclasses.methodlocal.trainbooking;

import java.time.LocalTime;

public class TrainBookings {
	private String username;
	private String pwd;

	public void booking(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
		double fare = 1235;
		LocalTime current = LocalTime.now(); //11:44
		int hour = current.getHour();
		System.out.printf("Logged In Time %d:%d:%d \n", current.getHour(), current.getMinute(), current.getSecond());

		if (username.equals("IRTC") && pwd.equals("IRTC")) {
			if (hour >= 11 && hour <= 12) {
				tatkalBookings(username, pwd);
			} else {
				System.out.println("Welcome to Normal Booking " + username);
				System.out.println("Ticket has successfully been booked " + fare + " INR");
			}
		}
		
		else
		{
			System.err.println("Invalid Credentials");
		}

	}

	public void tatkalBookings(String username, String password) {
		
		System.out.println("Welecome to Tatkal Booking " + username);
		class Tatkal {

			double fare = 2000;

			public void bookingTatkalTickets() {
				System.out.println(" Tatkal Ticket has successfully been booked " + 2000 + " INR");

			}
		}

		Tatkal tatkal = new Tatkal();
		tatkal.bookingTatkalTickets();
	}

}
