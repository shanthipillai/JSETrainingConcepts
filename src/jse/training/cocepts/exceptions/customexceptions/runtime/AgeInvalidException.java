package jse.training.cocepts.exceptions.customexceptions.runtime;

public class AgeInvalidException extends RuntimeException {

	AgeInvalidException()
	{
		System.out.println("This is user defined exception, You are not eligible for voting");
	}
	
}
