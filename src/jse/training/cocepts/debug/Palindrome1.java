package jse.training.cocepts.debug;

public class Palindrome1 {
    int num=122;
    int temp=121;
    int sum=0;
    int reminder;
    
        public void method()
    {
                
        
        while(num>0)
        {
            
            reminder=num%10;
                       
                            
            sum=(sum*10)+reminder;
                            
            
         
            num=num/10;    
        }
        if(temp==sum)
        {
            System.out.println("given number is palindrome");
        }
        else
        {
            System.out.println("given number is not palindrome");
        }
    }


    public static void main(String[] args) {
        Palindrome1 obj=new Palindrome1();
        obj.method();
        
    }


}