package jse.training.cocepts.collection.list.arraylist.Comparator.thenComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ThenComparatorUsage {
public static void main(String[] args) {

	List<Policy> policies=new ArrayList<Policy>();
	policies.add(new Policy(21, "LifeInsurance", 101));
	policies.add(new Policy(12, "LifeInsuranceRenewed", 101));
	policies.add(new Policy(15, "LifeInsuranceSeniorCitizen", 101));
	policies.add(new Policy(10, "VehicleInsurance", 102));
	policies.add(new Policy(10, "VehicleInsuranceRenewed", 102));
	policies.add(new Policy(25, "PropertyDamage", 107));
	
	//Not working
	Comparator<Policy> compare1=new Comparator<Policy>() {

		@Override
		public int compare(Policy o1, Policy o2) {
		
			if(o1.getPollicyDept()<o2.getPollicyDept())
			
			return 1;
			
			return -1;
		}
	};
	
	
	Comparator<Policy> compare2=new Comparator<Policy>() {

		@Override
		public int compare(Policy o1, Policy o2) {
		
		
			if(o1.getPolicyType().length()<o2.getPolicyType().length())
	
			return -1;
			
			return 1;
		
		}
	};
policies.sort(compare1.thenComparing(compare2));

//Collections.sort(policies, compare1.thenComparing(compare2));
//	policies.sort(compare2);
Iterator<Policy>policy=policies.iterator();
	while(policy.hasNext())
	{
		Policy p=policy.next();
		System.out.println(p.getPolicyNo()+"   "+p.getPolicyType()+"   "+p.getPollicyDept());
	}
	
//Not Working
	
	Comparator<Policy> compare3=Comparator.comparingInt(Policy::getPollicyDept);
	Comparator<Policy> compare4=Comparator.comparing(Policy::getPolicyType);
//Comparator<Policy> compare4=Comparator.comparing(Policy::getPolicyType).reversed();
	
	policies.sort(compare3.thenComparing(compare4));
	Iterator<Policy>policy1=policies.iterator();
	System.out.println();
	while(policy1.hasNext())
	{
		Policy p=policy1.next();
		System.out.println(p.getPolicyNo()+"   "+p.getPolicyType()+"   "+p.getPollicyDept());
	}

}
}

