package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class Inbuilt_HasMap {

	public static void main(String[] args) {

//-- Creating HashMap:
		HashMap<String, Integer> map = new HashMap<String, Integer>();

//-- Inserting keys and values in Map:
		map.put("abc", 1);
		map.put("efg", 2);
		map.put("lmo", 3);

//-- Iterating through map and printing all keys: 'Requires to create a set'
		Set<String> keys = map.keySet();
		for(String s : keys) {
			System.out.print(s+" ");
		}
		System.out.println();
//-- check if the key is present in map or not:
		if(map.containsKey("abc")) {
			System.out.println("Contains abc");
		}

		if(map.containsKey("xyz")) {
			System.out.println("Contains xyz");
		}
		else {
			System.out.println("Does not contains xyz");
		}
//-- getting the value of a particular key: 
		//'if key not present and we try to get we get Null pointer exception'
		//'so before accessing the value always check if map contains key or not'
		int v = map.get("abc");
		System.out.println("abc value: "+v);

		if(map.containsKey("xyz")) {
			int v2 = map.get("xyz");
			System.out.println("xyz value: "+v2);
		}
//-- size of map:
		System.out.println("size: "+map.size());
//-- removing a key from map:
		map.remove("abc");
		for(String s : keys) {
			System.out.print(s+" ");
		}
	System.out.println();	
		int a = map.get("efg");
		a = a+1;
		map.put("efg", a);
		int b = map.get("efg");
		System.out.println(b);
	}
	
}
