package jse.training.concepts.operators;

public class UniaryOperator {
public static void main(String[] args) {
	int a=10;
	int b=10;
   //Prefix Increment
	
	System.out.println(++a); //a=11
	System.out.println(++a+b++);
	System.out.println(++b+a++*10);
	
	int m=10, n=10, l=10;
	
	m+=n; //(m=m+n)
	m-=n*=l;  // (m=m=n*l)
	System.out.println(m);
	
	m+=n*=n+n; //m=m+n*n+n;
	
	int sqrt=11;
	sqrt*=sqrt;
	int cubrt=11;
	cubrt*=cubrt*=cubrt;
	
}
}
