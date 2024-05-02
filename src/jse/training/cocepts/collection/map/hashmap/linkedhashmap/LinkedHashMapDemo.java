package jse.training.cocepts.collection.map.hashmap.linkedhashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.stream.Stream;

public class LinkedHashMapDemo {
	/*
	 * Linked Hash Map : 
	 * Insertion Order Preserved
	 * Duplicates are not allowed
	 * Null allowed only once
	 * Linked Hash Map is sub class of Hash Map
	 * Default Capacity is 16
	 * Non-Synchronized
	 * Hashtable+DoubleLinkedList DS
	 */
public static void main(String[] args) throws ClassNotFoundException {
	Class cls=Class.forName("java.util.LinkedHashMap");
	Class[] cs=cls.getDeclaredClasses();
	System.out.println("Methodology 1");
	for(Class innercls:cs)
	{
		System.out.println(innercls.getName());
	}
	//Printing Inner Classes Detatils Using Java 8
	System.out.println("Methodology 2");
	Stream.of(cs).forEach(i->System.out.println(i.getName()));
	System.out.println("Methodology 3");
	Arrays.stream(cs).forEach(i->System.out.println(i.getName()));

	LinkedHashMap<Integer, Integer> htab=new LinkedHashMap<Integer, Integer>();

	//creating HashMap to store key, value pair
	//Key -Integer, Value - Integer Type
	//HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();

	//Put is the method to add elements into Map
	map.put(1, 10);
	map.put(2, 20);
	map.put(3, 30);
	map.put(4, 40);
	map.put(5, 50);
	map.put(5, 60);
	map.put(6, 40);

	System.out.println(map);
	//Get the Value of the Key
	System.out.println(map.get(2));

	//Check if the Value is presnet in the Map
	System.out.println(map.containsValue(40));

	//Put the value into the map only if the key is not present
	map.putIfAbsent(2, 80);
	map.putIfAbsent(7, 80);

	//map.forEach((k,v)->System.out.println("key="+k+" Val="+v));
	//Simple Print of Map elements
	System.out.println(map);

	//Create a String based HashMap
	LinkedHashMap<String, Integer> stringmap=new LinkedHashMap<String, Integer>();
	stringmap.put("emp1", 101);
	stringmap.put("emp2", 102);
	stringmap.put("emp3", 103);
	stringmap.put("emp4", 104);
	stringmap.put("", 104);
	stringmap.put("", 108);
	stringmap.put(null, 109);
	stringmap.put(null, 110);

	//map.entrySet().stream().toArray();

	//stringmap.forEach((k,v)->System.out.println("key="+k+" Val="+v));

	System.out.println(stringmap);
	//Remove the Key
	map.remove(2);
	System.out.println(map);

	//Check if the Map is empty
	System.out.println(map.isEmpty());

	//Replace the value of the key
	map.replace(3, 35);

	System.out.println(map);
	//Replace the value by being more specific
	map.replace(3, 35, 37);
	System.out.println(map);


	System.out.println(map.getOrDefault(9, 0));
	System.out.println(stringmap.getOrDefault("anydata", 0));

	LinkedHashMap<String, String> stringmap1=new LinkedHashMap<String, String>();
	stringmap1.put("key1", "value1");
	stringmap1.put("key2", "value2");
	stringmap1.put("key3", "value3");
	stringmap1.put(null, null);
	stringmap1.put(null, "value");
	System.out.println(stringmap1.getOrDefault("key4", "Doesn't exist"));
	System.out.println(stringmap1);
	
	
}
}
