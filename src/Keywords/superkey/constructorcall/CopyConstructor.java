package Keywords.superkey.constructorcall;

public class CopyConstructor {
int x=10;

CopyConstructor()
{
	
}
CopyConstructor(int x)
{
	
}
	public static void main(String[] args) {
	
		
		CopyConstructor obj1=new CopyConstructor(10);
		CopyConstructor obj2=new CopyConstructor(20);
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		

	}

}
