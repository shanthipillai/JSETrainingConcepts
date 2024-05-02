package jse.training.cocepts.collection.map.hashmap.internalworkflow;

import java.util.HashMap;
import java.util.Map;
/*Debug 
 * Put breakpoint at Map creation
 * Map<String, Integer> map=new HashMap<String, Integer>();  (double click the line)
 * Right Click on this program-->Debug 
 * Use Eclipse F6 Arrow mark or your keyboard until after last put statement
 * Open Variables Section and -->Click on Tables and understand the internal flow
 */
public class HashMapWorking {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<String, Integer>();
	map.put("Xy", 1);  //F6
	map.put("ZA", 2);  //F6
	
    map.put("Aa", 3);  //F6
	map.put("BB", 64);  //F6
	map.put(null, 55);  //F6
	/*
	map.put("Xy1", 54);
	map.put("Xy2", 4);
	map.put("Xy3", 54);
	map.put("Xy4", 4);
	map.put("Xy5", 74);
	map.put("Xy6", 4);
	map.put("Xy7", 47);
	map.put("Xy8", 1);
	map.put("Xy9", 8);
	*/
	//map.put(null, 7);
	System.out.println(map);  //Stop at this line
	//System.out.println("Aa".hashCode());
	//System.out.println("BB".hashCode());
    /*
     * 2112  Aa, BB
2849  Xy
2855  ZA 
     */

}
}
