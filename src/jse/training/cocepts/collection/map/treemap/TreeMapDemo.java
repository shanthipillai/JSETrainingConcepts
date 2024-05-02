package jse.training.cocepts.collection.map.treemap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapDemo {
	/*
	 * TreeMap follows default sorting order ASC
	 * duplicates are not allowed
	 * null keys are not allowed
	 * null values are allowed
	 * Red-black data structure it follows
	 * Non-Synchronized
	 */
public static void main(String[] args) throws ClassNotFoundException {
	Class cls=Class.forName("java.util.TreeMap");
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

	//TreeMap<Integer, Integer> htab=new TreeMap<Integer, Integer>();

	//creating HashMap to store key, value pair
	//Key -Integer, Value - Integer Type
	//HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
	TreeMap<Integer, Integer> map=new TreeMap<>();
	//Put is the method to add elements into Map
	map.put(1, 10);
	map.put(2, 20);
	map.put(3, 30);
	map.put(4, 40);
	map.put(5, 50);
	map.put(5, 60);
	map.put(6, 40);
	//map.put(null, null);

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
	TreeMap<String, Integer> stringmap=new TreeMap<String, Integer>();
	stringmap.put("emp1", 101);
	stringmap.put("emp2", 102);
	stringmap.put("emp3", 103);
	stringmap.put("emp4", 104);
	stringmap.put("", 104);
	stringmap.put("", 108);
	//stringmap.put(null, 109);
	//stringmap.put(null, 110);

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

	TreeMap<String, String> stringmap1=new TreeMap<String, String>();
	stringmap1.put("key1", "value1");
	stringmap1.put("key2", "value2");
	stringmap1.put("key3", "value3");
	//stringmap1.put(null, null);
	//stringmap1.put(null, "value");
	System.out.println(stringmap1.getOrDefault("key4", "Doesn't exist"));
	System.out.println(stringmap1);

	
	
}
}
