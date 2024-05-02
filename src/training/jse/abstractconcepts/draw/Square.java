package training.jse.abstractconcepts.draw;

import jse.training.concepts.abstractconcepts.draw.Draw;

public class Square extends Draw{

	@Override
	protected void shape() {
		System.out.println("Square created by proctected method");
		
	}


	@Override
	public void shapegui() {
	System.out.println("Square created by public method");
		
	}
	
	public static void main(String[] args) {
		Square square=new Square();
		square.shape();
		square.shapegui();
		
		Draw draw=new Square();
		
	}

	
}
