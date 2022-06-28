package javaconcepts;

import java.util.LinkedHashMap;
import java.util.Map;

// extends hash map extends abstarct map and impelements Map interfce
// maintains insertion order
// uses doubly linked list to maintain insertion order
// remaining same as hash map 
// basic operations O(1)

public class LinkedHashMapExample {
	public static void main(String[] args) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		map.put('a', 1);
		map.put('b', 2);
		map.put('c', 3);

		for (Map.Entry<Character, Integer> i : map.entrySet())
			System.out.println("key " + i.getKey() + " value " + i.getValue());

	}

}
