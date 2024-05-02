package jse.training.concepts.typecasting;

public class TypeCasting {
     public void Autoboxing()
     {
    	 byte b=120;
    	 
    	 int i=150000;
    	 short s=23000;
    	s= (short) (s+i);
    	System.out.println(s);
    	 
     }
     
     public void Unboxing()
     {
    	 
     }
	public static void main(String[] args) {
		
         byte b=120;
    	 
    	 int i=150000;
    	 short s=23000;
    	 long l=1000000000;
    	 
    	 l=s+i;
    	s=  (short) (s+l);
    	System.out.println(s);
    	 
		

	}

}
