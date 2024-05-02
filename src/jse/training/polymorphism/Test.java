package jse.training.polymorphism;

public class Test {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
        cal.generalCalculator();
        cal.extendedFunctions();
         
        
        
        ScientificCalculator obj=new ScientificCalculator();
        obj.generalCalculator();
        obj.extendedFunctions();
        
        
        Calculator calcy=new ScientificCalculator();
        calcy.generalCalculator();
        calcy.extendedFunctions();
	}

}
