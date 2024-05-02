package jse.training.thiskeyword;

public class ThisInvokesCurrentClassConstructor2 {
	int x, y, l, m;

	ThisInvokesCurrentClassConstructor2() {
		System.out.println("Default Constructor");
	}

	ThisInvokesCurrentClassConstructor2(int x, int y) {
		this(); // calls default constructor
		this.x=x;
		this.y=y;
		System.out.println(x);
		System.out.println(y);
	}

	ThisInvokesCurrentClassConstructor2(int x, int y, int l, int m) {
		
	//	this(); // calls default constructor
		this(x,y);  //This invokes two parameterized constructor
		this.l=l;
		this.m=m;
		//this.x=x;
		//this.y=y;
	//	System.out.println(x);
	//	System.out.println(y);
		System.out.println(l);
		System.out.println(m);
	}

	public static void main(String[] args) {

		ThisInvokesCurrentClassConstructor2 obj = new ThisInvokesCurrentClassConstructor2(12, 18,20,40);
	}

}
