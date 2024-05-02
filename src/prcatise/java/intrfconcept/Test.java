package prcatise.java.intrfconcept;

public class Test implements interface1, interface2 {

	@Override
	public void method1() {
		System.out.println("method1 overriden");
	}
	@Override
	public void defMethod()
	 {
		interface1.super.defMethod();
	 }

}
