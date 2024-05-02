package jse.training.cocepts.enumkey;

public class IterateEnumTypes {
	enum Months
	{

	// Months Jan=new Months();
		JAN, FEB, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec;
		//emp1, emp2, emp3;
	}
	
	public static void main(String[] args) {
		//Implicity method values()
		Months[] months=Months.values();
		System.out.println(Months.valueOf("JAN"));

		for(Months m:months)
		{
			System.out.println(m);
			System.out.println(m.ordinal());
			
		}
	}
}
