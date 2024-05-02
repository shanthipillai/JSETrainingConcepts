package jse.training.finalmethods;

public class ChildOfFinalMethod extends FinalMethod {
@Override
	public  void print()
	{
		
	}
/* Can't Overide Final methods , Static methods
@Override
public final static  void noOverride()
{
	
}
*/

//As there is no override on this method it will consider it as Child class static method
public final static void noOveride()
{
	
}
}
