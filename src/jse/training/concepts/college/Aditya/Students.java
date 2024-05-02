package jse.training.concepts.college.Aditya;
//Class Name: Students  
 public class Students {
	 int studId;
	//Constructor
	protected  Students()
	{
		System.out.println("Construtor");
		
	}
	
	
	//Instance Method
	 protected void details()
	{
		System.out.println("Details");
		System.out.println(studId);
	}
	
	//Static Method
	 static void collegeName()
	{
		System.out.println("Static Method");
		
	}
}
