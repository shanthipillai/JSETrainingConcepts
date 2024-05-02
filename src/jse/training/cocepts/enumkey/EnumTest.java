package jse.training.cocepts.enumkey;

enum Months
{
	
	//Months Jan=new Months();
	JAN, FEB, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec;
	//emp1, emp2, emp3;
}

public class EnumTest {

	/*
	enum Months
	{
		
		//Months Jan=new Months();
		JAN, FEB, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec;
		//emp1, emp2, emp3;
	}
	*/
	
	public static void main(String[] args) {
		Months Jan=Months.JAN;
		System.out.println(Months.JAN);
		System.out.println(Jan);
		
		System.out.println(Jan.toString());
		
		
	}
}
