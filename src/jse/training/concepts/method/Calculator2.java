package jse.training.concepts.method;
class Calculator2
{
//This method will do the sum of two digits given by the user and prints the value.

/*
*user defined method sum() and parameterized.
it contains two parameters x & y of int type
*/

 void sum(int x,int y)
{
final float PI=3.14f;
int z=x+y;

System.out.println(z); 

}

//This method will do sum of two digits given by user and prints value

/*
*User defined method sum() and parameterized.it contains two parameters x & y of one int type and one float type
*/

public void sum(int x,float y)
{

float z=x+y;
System.out.println(z);

}

//this method will do the sum of two digits and prints value
/*
*User defined method sum() and parameterized.it contains two parameters x & y of float type.
*/

public void sum(float x,float y)
{

float z=x+y;
System.out.println(z);
}


//This method will do the sub of two digits given by the user and prints the value.

/*
*user defined method sub() and parameterized.
it contains two parameters x & y of int type
*/

public void sub(int x,int y)
{

int z=x-y;
System.out.println(z);

}

//This method will do sub of two digits given by user and prints value

/*
*User defined method sub() and parameterized.it contains two parameters x & y of one int type and one float type
*/

public void sub(int x,float y)
{

float z=x-y;
System.out.println(z);

}

//this method will do the sub of two digits and prints value
/*
*User defined method sub() and parameterized.it contains two parameters x & y of float type.
*/

public void sub(float x,float y)
{

float z=x-y;
System.out.println(z);
}

//This method will do the mul of two digits given by the user and prints the value.

/*
*user defined method mul() and parameterized.
it contains two parameters x & y of int type
*/

public void mul(int x,int y)
{

int z=x*y;
System.out.println(z);

}

//This method will do mul of two digits given by user and prints value

/*
*User defined method mul() and parameterized.it contains two parameters x & y of one int type and one float type
*/

public void mul(int x,float y)
{

float z=x*y;
System.out.println(z);

}

//this method will do the mul of two digits and prints value
/*
*User defined method mul() and parameterized.it contains two parameters x & y of float type.
*/

public void mul(float x,float y)
{

float z=x*y;
System.out.println(z);
}
//This method will do the div of two digits given by the user and prints the value.

/*
*user defined method div() and parameterized.
it contains two parameters x & y of int type
*/

public void div(int x,int y)
{

int z=x/y;
System.out.println(z);

}

//This method will do div of two digits given by user and prints value

/*
*User defined method div() and parameterized.it contains two parameters x & y of one int type and one float type
*/

public void div(int x,float y)
{

float z=x/y;
System.out.println(z);

}

//this method will do the div of two digits and prints value
/*
*User defined method div() and parameterized.it contains two parameters x & y of float type.
*/

public void div(float x,float y)
{

float z=x/y;
System.out.println(z);
}

//Main method defined
/*
*Object is created ,obj is the reference
*/

public static void main(String args[])
{

Calculator2 obj=new Calculator2();
obj.sum(12,13);
obj.sum(12,2.4f);
obj.sum(12.4f,1.3f);
obj.sub(13,17);
obj.sub(12,1.0f);
obj.sub(1.2f,1.0f);
obj.mul(12,13);
obj.mul(12,1.3f);
obj.mul(1.2f,1.3f);
obj.div(12,24);
obj.div(12,48.5f);
obj.div(1.4f,1.2f);

}


}
