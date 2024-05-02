package jse.training.tokens;

public class UniaryOpers {
public static void main(String[] args) {
	int a=10;
//	int b=a++;
	//System.out.println(b);
	//System.out.println(a);
	
	int val=(a++)+(a++);  //10+12
	//12+14
	int val2=(a++)+(++a);
	System.out.println(val);
	System.out.println(val2);
	
	int b=10;
	//9+9
	//int val3=(--b)+(b--);
	int val4=(b--)+(--b);
	//System.out.println(val3);
	System.out.println(val4);
	
	int x=10;
	int val5=(x++)+(--x);
	System.out.println(val5);
	
	
	int sal=100;
	//sal=sal*sal;
	//sal*=sal;
	//sal+=sal;
	//sal-=sal;
	sal/=sal;
	
	
	System.out.println(sal);
}
}
