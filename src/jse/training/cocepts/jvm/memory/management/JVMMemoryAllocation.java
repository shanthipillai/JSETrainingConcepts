package jse.training.cocepts.jvm.memory.management;

public class JVMMemoryAllocation {
	//instance Variable
    long serielId=39484383;
  static  String site="https://oracle";
  
  //Instance Method
	public void jvmDetails()
	{
		long jvmVersion=17;
		String javaVendor="Oracle";
	}
	
	public static void programDetails()
	{
		System.out.println("This is static method");
	}
	public static void main(String[] args) {
		//String Constant Pool
	String description="JVM Memory Allocation";
	//Creating Object -Heap
	JVMMemoryAllocation jvm=new JVMMemoryAllocation();
	jvm.jvmDetails();
	
	}

}
