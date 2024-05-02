package jse.training.cocepts.collection.map.hashtable;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class IterateHashTable {

	public static void iterateMap(Hashtable<Integer, Integer> map)
	{
		for(Map.Entry<Integer, Integer> iter:map.entrySet())
		{
			System.out.println("Key=="+iter.getKey()+" Value= "+iter.getValue());
		}
	}
	
	
	public static void iterateMapUsingEnumerationVals(Hashtable<Integer, Integer> map)
	{
	
		Enumeration<Integer> enumerations=map.elements();
		while(enumerations.hasMoreElements())
		{
			System.out.println(enumerations.nextElement());
		}
	}
	
	public static void iterateMapUsingEnumerationKeys(Hashtable<Integer, Integer> map)
	{
	    
		Enumeration<Integer> enumerations=map.keys();
		while(enumerations.hasMoreElements())
		{
			System.out.println(enumerations.nextElement());
		}
	}
	
	
	public static void combineEnumerators(Hashtable<Integer, Integer> map)
	{
		Enumeration<Integer> keys=map.keys();
		Enumeration<Integer> vals=map.elements();
		while(keys.hasMoreElements() && vals.hasMoreElements())
		{
			System.out.println("Key=="+keys.nextElement()+"Value= "+vals.nextElement());
		}
		
	}
	public static void iterateMap2(Hashtable<Integer, Integer> map)
	{
		Set<Entry<Integer,Integer>> mapset=map.entrySet();
		Iterator<Entry<Integer,Integer>> mapiter= mapset.iterator();
		while(mapiter.hasNext())
		{
			Entry<Integer, Integer> ei=mapiter.next();
			System.out.println("Key= "+ei.getKey()+" Value= "+ei.getValue());
		}
		
	} 
	
	public static void iterateMap3(Hashtable<Integer, Integer> map)
	{
	Set<Integer> in=	map.keySet();
    Iterator<Integer> setvals=in.iterator();
    while(setvals.hasNext())
    {
    	System.out.println(setvals.next());
    }
	}
	
	public static void iterateMap4(Hashtable<Integer, Integer> map)
	{
	Collection<Integer> col=     map.values();
	Iterator<Integer> iter=col.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	}
	
	
	
	public static void iterateMapJava8(Hashtable<Integer, Integer> map)
	{
	    map.forEach((k,v)->System.out.println("Key= "+k+" Value="+v));
	}
	
	
	
	
	public static void iterateMap2Java8(Hashtable<Integer, Integer> map)
	{
	    map.entrySet().stream().forEach(entry->System.out.println("Key= "+entry.getKey()+" Value="+entry.getValue()));
	}
	
	
	public static void iterateMap3Java8(Hashtable<Integer, Integer> map)
	{
		
		Hashtable<Integer, Integer> newmap=new Hashtable<Integer, Integer>();
	    map.entrySet().stream().filter(e->e.getKey()>5).forEach(entry->System.out.println("Key= "+entry.getKey()+" Value="+entry.getValue()));
	 
	
	}
	
	public static void iterateMap4Java8(Hashtable<Integer, Integer> map)
	{
	 
		map.keySet().stream().forEach(System.out::println);
	
	}
	
	
	public static void iterateMap5Java8(Hashtable<Integer, Integer> map)
	{
	 
		map.values().stream().forEach(System.out::println);
	
	}
	
	
	public static void iterateMap6Java8(Hashtable<Integer, Integer> map)
	{
	// map.computeIfPresent(2, (k,v)->v*20);
	map.compute(2, (k,v)->v*20);
	System.out.println(map);
	

	}
	
	
	public static void iterateMap7Java8(Hashtable<Integer, Integer> map)
	{
	// map.computeIfPresent(2, (k,v)->v*20);
	map.values().stream().map(i->i+50).forEach(System.out::println);
	
	//System.out.println(map);
	
	

	}
	
	public static void iterateMap8Java8(Hashtable<Integer, Integer> map)
	{
	// map.computeIfPresent(2, (k,v)->v*20);
	Map<Object, Object> mapfinal=	 map.entrySet().stream().filter(e->e.getKey()>5).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
	
	System.out.println(mapfinal);
	//System.out.println(map);
	
	}
	
	
	
	public static void mergeMap9Java8()
	{
		
		Hashtable<Integer, Integer> hm=new Hashtable<Integer, Integer>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		
		
		HashMap<Integer, Integer> hm1=new HashMap<Integer, Integer>();
		hm.put(5, 50);
		hm.put(6, 60);
		
		//hm1.ent
	
	}
	public static void main(String[] args) {
		Hashtable<Integer, Integer> map=new Hashtable<Integer, Integer>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);
		map.put(6, 40);
		map.put(7,50);
		IterateHashTable.iterateMap(map);
		IterateHashTable.iterateMap2(map);
		IterateHashTable.iterateMap3(map);
		IterateHashTable.iterateMap4(map);
		IterateHashTable.iterateMapJava8(map);
		IterateHashTable.iterateMap2Java8(map);
		System.out.println("Filter");
		IterateHashTable.iterateMap3Java8(map);
		
		IterateHashTable.iterateMap4Java8(map);
		IterateHashTable.iterateMap5Java8(map);
		IterateHashTable.iterateMap6Java8(map);
		IterateHashTable.iterateMap7Java8(map);
		System.out.println("ToMap");
		IterateHashTable.iterateMap8Java8(map);
		iterateMapUsingEnumerationVals(map);
		iterateMapUsingEnumerationKeys(map);
		combineEnumerators(map);
	}
}
