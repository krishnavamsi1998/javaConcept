package javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet internally implements Set interface
// it does not maintain insertion order
// does not allow duplicate values
// allows null values
// not synchronized
// internally works similar to hash map
// also stores unique collection of objects
// default/initial capacity : 16 , load factor :0.75
// which when hash set is 75% full , then the capacity doubles
// HashSet<Integer> set=new HashSet<>(int capacity, float loadfactor);
// set.add(value) method returns true if added successfully , else false 

//some methods : add,remove , size, clear ,isEmpty etc

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<>();
		
		HashSet<ArrayList<Integer>> listSet=new HashSet<ArrayList<Integer>>();
		
		//synchronized set
		Set<Integer> set1=Collections.synchronizedSet(new HashSet<Integer>());
		
		System.out.println("return type of add method");
		
		System.out.println(set.add(101));
		System.out.println(set.add(4));
		System.out.println(set.add(1));
		System.out.println(set.add(3));
		System.out.println(set.add(7));

		Iterator<Integer> i = set.iterator();
		
		System.out.println("\nusing iterator");
		while(i.hasNext())
			System.out.print(i.next()+" ");
		
		//we can use for-each also
		System.out.println("\nusing for each loop");
		for(Integer j:set)
			System.out.print(j+" ");
			
		
		//stores unique lists
		ArrayList<Integer> list1 =new ArrayList<>();
		
		ArrayList<Integer> list2 =new ArrayList<>();	
		
	
		list1.add(1);
		list1.add(2);
		
		
		//adding same elements 
		list2.add(1);
		list2.add(2);
		
		//adding to set
		
		listSet.add(list1);
		listSet.add(list2);
		
		//takes only list1
		System.out.println("\n"+listSet);
		
		/*op:
			return type of add method
					true
					true
					true
					true
					true

					using iterator
					1 3 4 101 7 
					using for each loop
					1 3 4 101 7 
					[[1, 2]] */
		
		
		
	}

}
