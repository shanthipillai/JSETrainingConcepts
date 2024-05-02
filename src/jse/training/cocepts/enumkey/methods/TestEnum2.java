package jse.training.cocepts.enumkey.methods;

public class TestEnum2 {
public static void main(String[] args) {
	
	Color2[] colors=Color2.values();
	for(Color2 color:colors)
	{
       color.info();
	}
}
}
