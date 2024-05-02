package jse.training.cocepts.accessmodifiers.exceptions;

public class ThrowExceotions {
public static void main(String[] args) throws ClassNotFoundException {
	
int x=-1;
	if(x<0)
	{
		throw new ClassNotFoundException("This is the checked exception");
		
	}
}
}
