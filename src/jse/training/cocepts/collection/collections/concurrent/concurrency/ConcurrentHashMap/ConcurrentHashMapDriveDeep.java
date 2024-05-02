package jse.training.cocepts.collection.collections.concurrent.concurrency.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDriveDeep {
public static void main(String[] args) {
	ConcurrentHashMap<String, Integer> map=new ConcurrentHashMap<>();
	map.put("test1", 1);
	map.put("test2", 2);
	map.put("test3", 3);
	map.put("test4", 4);
	
	//map.compute("test7",(key,val)->val==null?1:val+1);
	
	map.computeIfPresent("test7",(key,val)->val==null?1:val+1);
	
	System.out.println(map);
	System.out.println(map.containsKey("test1"));
	System.out.println(map.containsValue(3));
	ConcurrentHashMap<Integer, Employee> empmap=new ConcurrentHashMap<>();
	Employee emp1=new Employee(1, "xyz");
	Employee emp2=new Employee(1, "xyz1");
	Employee emp3=new Employee(1, "xyz2");
	
	empmap.put(1,emp1);
	empmap.put(2,emp2);
	empmap.put(3,emp3);
	System.out.println(map.mappingCount());
	
//	map.mappingCount();
	
}
}
