package javaconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// HashMap extends abstract map and implements abstract interface
// not synchronized 
// can have one null key and many null values
// does not maintain order
// default/initial capacity is 16 and load factor 0.75

//put,get,remove,size,isEmpty,clear are some basic methods
// with a good hash function the time complexity of these methods would be O(1)
// for internal working hash function refer gfg

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<>();

		map.put('a', 1);
		map.put('b', 1);

		// returns if key is present return that mapped value else returns default value
		// mentioned
		System.out.println(map.getOrDefault('d', 1));

		System.out.println("different ways of traversing map");

		System.out.println("using entry set to iterate");

		for (Map.Entry<Character, Integer> i : map.entrySet())
			System.out.println("key " + i.getKey() + " value " + i.getValue());

		System.out.println("iterating over only keys");

		for (Character i : map.keySet())
			System.out.println("key " + i);

		System.out.println("iterating over only values");

		for (Integer i : map.values())
			System.out.println("value " + i);

		System.out.println("using entry set iterator");

		Iterator<Entry<Character, Integer>> i = map.entrySet().iterator();

		while (i.hasNext()) {
			// use next method only once
			Entry<Character, Integer> j = i.next();
			System.out.println("key " + j.getKey() + " value " + j.getValue());
		}

		// using lambda for each
		System.out.println("using lambda for each");

		map.forEach((k, v) -> System.out.println("key " + k + " value " + v));

		System.out.println("Iterating over keys and searching for values (inefficient) ");

		for (Character k : map.keySet()) {
			System.out.println("key " + k + " value " + map.get(k));
		}
	}

}
