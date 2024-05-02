package jse.training.concepts.eclipseoverview;

public class Parent {
int x;
int y;


	public Parent(int x) {
	super();
	this.x = x;
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



	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public Parent()
	{
		
	}
	
	public void print()
	{
		System.out.println("Print from Parent4");
	}
	
	private void printing()
	{
		System.out.println("This is private method");
	}
}
