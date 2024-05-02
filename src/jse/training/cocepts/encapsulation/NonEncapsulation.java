package jse.training.cocepts.encapsulation;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
public class NonEncapsulation {

	
	private int x;
	private int y;
	String s;
	
	
	
	
	public NonEncapsulation() {
		super();
		// TODO Auto-generated constructor stub
	}




	public NonEncapsulation(int x, int y, String s) {
		super();
		this.x = x;
		this.y = y;
		this.s = s;
	}




	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}




	public String getS() {
		return s;
	}




	public void setS(String s) {
		this.s = s;
	}




	public void print()
	{
		System.out.println("Printing");
	}
	
	
	
	
	/*
	public String getDBConnection()
	{
		return "connection";
	}
	*/
/*	
	public void connectDB()
	{
		getDBConnection();
	}
	*/
}
