package jse.training.methodcreations;

class MyFancyCalculator2
{
int subOfTwoNos(int a, int b)
{
	//System.out.println(a-b);
return a-b;
}
float subOfTwoNos(int a, float b)
{
return a-b;
}
float subOfTwoNos(float a, float b)
{
return a-b;
}
double subOfTwoNos(float a, double b)
{
return a-b;
}
double subOfTwoNos(double a, float b)
{
return a-b;
}
double subOfTwoNos(double a, double b)
{
return a-b;
}


public static void main(String args[])
{
MyFancyCalculator2 obj=new MyFancyCalculator2();


obj.subOfTwoNos(8,4.2f);
obj.subOfTwoNos(8.3f,4.5f);
obj.subOfTwoNos(8.2f,4.11223);
obj.subOfTwoNos(8.12356,4.1f);
obj.subOfTwoNos(8.3964,4.67843);
System.out.println("subOfTwoNos");
int a=obj.subOfTwoNos(8,4);
System.out.println(a);
}
}