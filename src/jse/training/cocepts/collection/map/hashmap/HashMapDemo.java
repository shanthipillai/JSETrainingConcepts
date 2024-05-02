package jse.training.cocepts.collection.map.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.stream.Stream;

public class HashMapDemo {
public static void main(String[] args) throws ClassNotFoundException {
/*No Insertion Order is Preserved
 * Duplicate keys are not allowed
 * Duplicates Values are allowed
 * Null Key is allowed but only once
 * Default Capacity is 16
 * Lock Will be applied to whole HashMap
 * Load Factor 75% (16*0.75=12)
 * 16 buckets =2^4 note this for further sessions
 * Not Thread Safe
 * DS: Hash Functions, Arrays of Buckets, LinkedList or Treee
 */
Class cls=Class.forName("java.util.HashMap");
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

Hashtable<Integer, Integer> htab=new Hashtable<Integer, Integer>();

//creating HashMap to store key, value pair
//Key -Integer, Value - Integer Type
//HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
HashMap<Integer, Integer> map=new HashMap<>();
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
HashMap<String, Integer> stringmap=new HashMap<String, Integer>();
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

HashMap<String, String> stringmap1=new HashMap<String, String>();
stringmap1.put("key1", "value1");
stringmap1.put("key2", "value2");
stringmap1.put("key3", "value3");
stringmap1.put(null, null);
stringmap1.put(null, "value");
System.out.println(stringmap1.getOrDefault("key4", "Doesn't exist"));
System.out.println(stringmap1);
}
}