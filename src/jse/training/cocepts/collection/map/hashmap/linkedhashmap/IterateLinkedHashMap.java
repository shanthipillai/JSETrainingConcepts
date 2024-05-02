package jse.training.cocepts.collection.map.hashmap.linkedhashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class IterateLinkedHashMap {

	public static void iterateMap(LinkedHashMap<Integer, Integer> map)
	{
	  
		System.out.println("Map-Entry Way of Retrieving Values");
		for(Map.Entry<Integer, Integer> iter:map.entrySet())
		{
			System.out.println("Key="+iter.getKey()+" Value= "+iter.getValue());
		}
	}
	
	public static void iterateMap2(LinkedHashMap<Integer, Integer> map)
	{
		
		System.out.println("Map-Entry-Set Iterator Combinations");
		Set<Entry<Integer,Integer>> mapset=map.entrySet();
		Iterator<Entry<Integer,Integer>> mapiter= mapset.iterator();
		while(mapiter.hasNext())
		{
			Entry<Integer, Integer> ei=mapiter.next();
			System.out.println("Key= "+ei.getKey()+" Value= "+ei.getValue());
		}
		
	} 
	
	public static void iterateMap3(LinkedHashMap<Integer, Integer> map)
	{
		System.out.println("Print only Key Values Map Interface");
	Set<Integer> in=	map.keySet();
    Iterator<Integer> setvals=in.iterator();
    while(setvals.hasNext())
    {
    	System.out.println(setvals.next());
    }
	}
	
	public static void iterateMap4(LinkedHashMap<Integer, Integer> map)
	{
		System.out.println("Print only values using Map");
	Collection<Integer> col=     map.values();
	Iterator<Integer> iter=col.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
	}
	}
	
	
	public static void iterateMap5(LinkedHashMap<Integer, Integer> map)
	{
		
		System.out.println("Combining KeySet and Values");
		Set<Integer> in=	map.keySet();
		Collection<Integer> col=     map.values();
		Iterator<Integer>iterkeys=in.iterator();
		Iterator<Integer> itervals=col.iterator();
		while(iterkeys.hasNext()  && itervals.hasNext())
		{
			System.out.println("Key= "+iterkeys.next() + "Values"+itervals.next());
		}
		
		
	}
	
	
	public static void iterateMapJava8(LinkedHashMap<Integer, Integer> map)
	{
	    map.forEach((k,v)->System.out.println("Key= "+k+" Value="+v));
	}
	
	
	
	
	public static void iterateMap2Java8(LinkedHashMap<Integer, Integer> map)
	{
	    map.entrySet().stream().forEach(entry->System.out.println("Key= "+entry.getKey()+" Value="+entry.getValue()));
	}
	
	
	public static void iterateMap3Java8(LinkedHashMap<Integer, Integer> map)
	{
		
		Map<Integer, Integer> newmap=new HashMap<Integer, Integer>();
	    map.entrySet().stream().filter(e->e.getKey()>5).forEach(entry->System.out.println("Key= "+entry.getKey()+" Value="+entry.getValue()));
	 
	
	}
	
	public static void iterateMap4Java8(LinkedHashMap<Integer, Integer> map)
	{
	 
		map.keySet().stream().forEach(System.out::println);
	
	}
	
	
	public static void iterateMap5Java8(LinkedHashMap<Integer, Integer> map)
	{
	 
		map.values().stream().forEach(System.out::println);
	
	}
	
	
	public static void iterateMap6Java8(LinkedHashMap<Integer, Integer> map)
	{
	// map.computeIfPresent(2, (k,v)->v*20);
	map.compute(2, (k,v)->v*20);
	System.out.println(map);
	

	}
	
	
	public static void iterateMap7Java8(LinkedHashMap<Integer, Integer> map)
	{
	// map.computeIfPresent(2, (k,v)->v*20);
	map.values().stream().map(i->i+50).forEach(System.out::println);
	
	//System.out.println(map);
	
	

	}
	
	public static void iterateMap8Java8(LinkedHashMap<Integer, Integer> map)
	{
	// map.computeIfPresent(2, (k,v)->v*20);
	Map<Object, Object> mapfinal=	 map.entrySet().stream().filter(e->e.getKey()>5).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
	
	System.out.println(mapfinal);
	//System.out.println(map);
	
	}
	
	
	
	public static void mergeMap9Java8()
	{
		
		LinkedHashMap<Integer, Integer> hm=new LinkedHashMap<Integer, Integer>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		
		
		HashMap<Integer, Integer> hm1=new LinkedHashMap<Integer, Integer>();
		hm.put(5, 50);
		hm.put(6, 60);
		
		//hm1.ent
	
	}
	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		map.put(5, 50);
		map.put(6, 40);
		map.put(7,50);
		
		
		IterateLinkedHashMap.iterateMap(map);
		IterateLinkedHashMap.iterateMap2(map);
		IterateLinkedHashMap.iterateMap3(map);
		IterateLinkedHashMap.iterateMap4(map);
		IterateLinkedHashMap.iterateMap5(map);
		IterateLinkedHashMap.iterateMapJava8(map);
		IterateLinkedHashMap.iterateMap2Java8(map);
		System.out.println("Filter");
		IterateLinkedHashMap.iterateMap3Java8(map);
		
		IterateLinkedHashMap.iterateMap4Java8(map);
		IterateLinkedHashMap.iterateMap5Java8(map);
		IterateLinkedHashMap.iterateMap6Java8(map);
		IterateLinkedHashMap.iterateMap7Java8(map);
		System.out.println("ToMap");
		IterateLinkedHashMap.iterateMap8Java8(map);
	}
}
