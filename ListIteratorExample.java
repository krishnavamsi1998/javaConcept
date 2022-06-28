package javaconcepts;

import java.util.ArrayList;
import java.util.ListIterator;

//works with list type collection like ArrayList, Linked List etc
//it iterates in bi-directional way 

public class ListIteratorExample {

	public static void main(String[] args) {
		
	ArrayList<Integer> list=new ArrayList<>();
	
	for(int i=0;i<5;i++)
		list.add(i);
	
	//removes even elements
	
	/*
	 * ListIterator<Integer> i = list.listIterator();
	 * 
	 * while(i.hasNext())
	 * 
	 * if(i.next()%2==0) { i.remove(); }
	 */
	
	//prints in reverse
	ListIterator<Integer> i1 = list.listIterator(list.size());
	
	while(i1.hasPrevious())
		System.out.println(i1.previous());
	
	
	}

}
