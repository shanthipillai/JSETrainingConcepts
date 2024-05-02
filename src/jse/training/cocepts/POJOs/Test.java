package jse.training.cocepts.POJOs;

public class Test {

	public static void main(String[] args) {
		Address address=new Address(530084,"Kondapur","Hyderabad");
		Address contraddress=new Address(530034,"Manikonda","Hyderabad");
		
		Employee emp=new Employee("Shyra", 1234,address);
		
        System.out.println("Emp ID= "+emp.getEmpId()+
        		                        "\nEmp Name="+emp.getEmpName()+
        		                        "\nPincode= "+emp.getAddress().getPincode()+
        		                        "\nStreet="+emp.getAddress().getStreetName()+
        		                        "\nCity= "+emp.getAddress().getCity()
        		                 
        		 );
        
        ContractEmployee  cemp=new ContractEmployee("ContractEmployee",contraddress);
        /*
        System.out.println("Contractor Name= "+ cemp.getCempName()+
        		"\nPincode= "+cemp.getAddress().getPincode()+
                "\nStreet="+cemp.getAddress().getStreetName()+
                "\nCity= "+cemp.getAddress().getCity()
        		);
        		*/
       
        System.out.println(cemp);
	}
	
	
	
}
