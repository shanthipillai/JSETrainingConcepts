package jse.training.cocepts.collection.map.hashmap.internalworking;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalWorking {
public static void main(String[] args) {
String a="Aa";
String b="BB";
	System.out.println(a.hashCode());
	
System.out.println(b.hashCode());
	Map<String, Integer> map=new HashMap<String, Integer>();
	//map.put("Shanthi", 1);
//	map.put("Shyra",2);
	//map.put("xyz",3);
	map.put("Aa",4);
	map.put("BB", 5);
	String val1="Aa";
	String val2="BB";
	//System.out.println(val1.hashCode());
	//System.out.println(val2.hashCode());
	//map.put("Shanthi", 5);
	map.put("FB", 7);
map.put("Ea", 7);
	
	
}
}
