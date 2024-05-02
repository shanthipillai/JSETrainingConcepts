package jse.training.concepts.additional.topics;

public class AllowedIdentifiers {
int x=10_000;
//Java 8 accepts from Java 9 it's removed
int _=1;
//Not Allowed
/*
 int y=10._000;  
  int z=_10000;   
int z1=_10000;  
int _=1;
int z1=0000_;  
*/
//_ can be used as number figures
//After java 8 _ is not consider as identifier

public static void main(String[] args) {
	System.out.println(new AllowedIdentifiers().x);
	System.out.println(new AllowedIdentifiers()._);
	}
}

