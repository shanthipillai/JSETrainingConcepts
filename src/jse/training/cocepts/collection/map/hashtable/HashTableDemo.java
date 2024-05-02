package jse.training.cocepts.collection.map.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.stream.Stream;

public class HashTableDemo {
public static void main(String[] args) throws ClassNotFoundException {
/*No Insertion Order is Preserved
 * Duplicate keys are not allowed
 * Duplicates Values are allowed
 * Null Key or Value is not allowed
 * Default Capacity is 11
 * Lock Will be applied to whole HashMap
 * Load Factor 75% 
 * Thread Safe or Synchronized
 * It's legacy class introduced in earlier versions 
 * (1.0V)
 * Comparatively Hash Map gives more performance
 

 */
Class cls=Class.forName("java.util.Hashtable");
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



//creating HashMap to store key, value pair
Hashtable<Integer, Integer> map=new Hashtable<Integer, Integer>();
map.put(1, 10);
map.put(2, 20);
map.put(3, 30);
map.put(4, 40);
map.put(5, 50);
map.put(5, 60);
map.put(6, 40);
//map.put(null, null);


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
Hashtable<String, Integer> stringmap=new Hashtable<String, Integer>();
stringmap.put("emp1", 101);
stringmap.put("emp2", 102);
stringmap.put("emp3", 103);
stringmap.put("emp4", 104);
stringmap.put("", 104);
stringmap.put("", 108);
stringmap.put("null", 109);

//map.entrySet().stream().toArray();

//stringmap.forEach((k,v)->System.out.println("key="+k+" Val="+v));
System.out.println("Printing Hash String Vals");
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

Hashtable<String, String> stringmap1=new Hashtable<String, String>();
stringmap1.put("key1", "value1");
stringmap1.put("key2", "value2");
stringmap1.put("key3", "value3");
stringmap1.put("", "");
stringmap1.put("", "4");
System.out.println(stringmap1.getOrDefault("key4", "Doesn't exist"));
System.out.println(stringmap1);

}
}