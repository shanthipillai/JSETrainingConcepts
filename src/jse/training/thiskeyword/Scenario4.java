package jse.training.thiskeyword;

public class Scenario4 {
  static  int x=10;
  int y=20;
  
  public static void staticPrint()
  {
	  System.out.println("Static method");
  }
  //Can we access static vars and methods using this keyword in a non-static methods- YES
	public void print()
	{
		System.out.println("From Instance Method");
		this.y=30;
		this.x=55;
		this.staticPrint();
		System.out.println(y);
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scenario4 obj=new Scenario4();
		obj.print();

	}

}
