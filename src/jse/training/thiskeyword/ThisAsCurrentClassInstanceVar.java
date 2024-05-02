package jse.training.thiskeyword;

public class ThisAsCurrentClassInstanceVar {
	int x;
	int y;

	public void printVars() {
//	System.out.println(this.x);
		// System.out.println(this.y);
		System.out.println(x);
		System.out.println(y);
	}

	public static void printVarsInStaticMethod() {
		ThisAsCurrentClassInstanceVar obj = new ThisAsCurrentClassInstanceVar();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
