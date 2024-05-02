package jse.training.cocepts.encapsulation;

public class ProductEncaps {
	private String serielID;
	private String productName;
	public String getSerielID() {
		return serielID;
	}
	public void setSerielID(String serielID) {
		int count=0;
		for (int i = 0; i < serielID.length(); i++) {
			 
            // Checking the character for not being a
            // letter,digit or space
            if (!Character.isDigit(serielID.charAt(i))
                && !Character.isLetter(serielID.charAt(i))
                && !Character.isWhitespace(serielID.charAt(i))) {
                // Incrementing the countr for spl
                // characters by unity
                count++;
            }
            
            }
		System.out.println("Count"+count);
        if(count==0)
        {
        	this.serielID = serielID;}
        else
        {
        System.out.println("Invalid String");
     
        }
		
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
}
