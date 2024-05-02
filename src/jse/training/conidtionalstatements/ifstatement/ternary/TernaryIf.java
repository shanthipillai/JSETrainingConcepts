package jse.training.conidtionalstatements.ifstatement.ternary;

public class TernaryIf {
public static void main(String[] args) {
	int a=200, b=700,c=40,d=50;
	
	int max2=(a>b)?a:b;
	
	
	int max3=(a>b && a>c)?a:(b>c?b:c);
	
	
	
	int max4=(a>b && a>c && a>d)?a:((b>c && b>d)?b:(c>d?c:d));
	
	System.out.println(max2);
	System.out.println(max3);
	System.out.println(max4);
	
}
}
