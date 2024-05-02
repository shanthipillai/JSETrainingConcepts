package jse.training.cocepts.enumkey.methods;

public class TestEnum {
public static void main(String[] args) {
Color[] colors=	Color.values();
for(Color color:colors)
{
	color.getInfo();
}
}
}
