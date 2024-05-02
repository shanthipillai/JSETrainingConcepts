package jse.training.concepts.constructors;


class ConstructorSample
{

float x;
float y;
float z;

//Creating a constructor method which is non-parameterized

ConstructorSample()
{

 x=20;
 y=30;
 z=70;

}

//Creating a constructor method which is parameterized
ConstructorSample(float a,float b)
{
x=a;
y=b;

}


//Writing the user defined method printvalue()

public void printvalue()
{

y=x+60;
z=y-60;
x=z*20;

System.out.println(x);
System.out.println(y);
System.out.println(z);


}

//Writing the main method()

public static void main(String args[])
{

//Creating an object for the class,construct is the reference

ConstructorSample construct=new ConstructorSample();
construct.printvalue();

}



}