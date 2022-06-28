package javaconcepts;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// implements Navigable Map which extends sorted map and map
// works based on red black tree to maintain sorted order
// cannot contain null keys but can have multiple null values
// default : ascending order
// log(n) time complexity for basic operatoins like put , get

public class TreeHashMapExample {

	public static void main(String[] args) {

		System.out.println("sorts reverse way based on key");
		TreeMap<Character, Integer> map = new TreeMap<>(Collections.reverseOrder());

		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);

		for (Map.Entry<Character, Integer> i : map.entrySet())
			System.out.println("key " + i.getKey() + " value " + i.getValue());

		System.out.println("custom sort using key in reverse order ");
		TreeMap<Character, Integer> map11 = new TreeMap<Character, Integer>(new Comparator<Character>() {

			@Override
			public int compare(Character a, Character b) {
				return b.compareTo(a);

			}

		});
		
		//or
		
		TreeMap<Character, Integer> map1 = new TreeMap<Character, Integer>((a,b)-> b.compareTo(a));
		
		

		map1.put('a', 1);
		map1.put('b', 2);
		map1.put('c', 3);

		for (Map.Entry<Character, Integer> i : map1.entrySet())
			System.out.println("key " + i.getKey() + " value " + i.getValue());

		System.out.println("custom sort using value in reverse order ");

		TreeMap<Character, Integer> map2 = new TreeMap<Character, Integer>(new Comparator<Character>() {

			@Override
			public int compare(Character a, Character b) {
				if (map1.get(a) < map1.get(b))
					return 1;
				else
					return -1;

			}

		});

		map2.putAll(map1);
		for (Map.Entry<Character, Integer> i : map2.entrySet())
			System.out.println("key " + i.getKey() + " value " + i.getValue());
		
		

	}
	
	/*sorts reverse way based on key
	key c value 3
	key b value 2
	key a value 1
	custom sort using key in reverse order 
	key c value 3
	key b value 2
	key a value 1
	custom sort using value in reverse order 
	key c value 3
	key b value 2
	key a value 1*/



}
