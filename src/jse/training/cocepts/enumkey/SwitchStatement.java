package jse.training.cocepts.enumkey;

public class SwitchStatement {
	enum Months
	{

		//Months Jan=new Months();
		JAN, FEB, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec;
		//emp1, emp2, emp3;
	}
	
	public static void main(String[] args) {
	Months m=Months.Jul;
	//byte, short, char, char, int, Byte , Short, Integer, Long, String, Enum
	switch(m)
	{
	case JAN: System.out.println(Months.JAN);
	break;
	case FEB: System.out.println(Months.FEB);
	break;
	case Mar :System.out.println(Months.Mar);
	break;
	case Apr: System.out.println(Months.Apr);
	break;
	case May: System.out.println(Months.May);
	break;
	case Jun: System.out.println(Months.Jun);
	break;
	case Jul: System.out.println(Months.Jul);
	break;
	case Aug: System.out.println(Months.Aug);
	break;
	case Sep: System.out.println(Months.Sep);
	break;
	case Oct: System.out.println(Months.JAN);
	break;
	case Nov: System.out.println(Months.Nov);
	break;
	case Dec: System.out.println(Months.Dec);
	break;
	

	}

	}
}
