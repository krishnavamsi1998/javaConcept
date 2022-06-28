package javaconcepts;

import java.util.LinkedHashSet;


// maintains insertion order
// uses doubly linked list 
// implements set interface and extends the hashSet class

// hash set and linked hash set have O(1) time complexities 

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(3);
		set.add(8);
		
		for(int i:set)
			System.out.print(i+" ");
		
	}

}
