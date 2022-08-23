package javaRelated;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//shows what happens when multiple thread access hash map and concurrent hashmap

public class ConcurrentHashMapExample extends Thread{
	
	static Map<String,Integer> map=new ConcurrentHashMap<>();
	
	public void run() {
		try {
			Thread.sleep(1000);
			
			//Child Thread going to add 
			//new element which is not allowed
			
			map.put("D", 2);
					
		}
		catch(InterruptedException e) {
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		map.put("A", 2);
		map.put("B", 3);
		map.put("C", 4);
		
		// starting our custom thread
		ConcurrentHashMapExample t1=new ConcurrentHashMapExample();
		t1.start();
		//now iterating map using main thread
		
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+","+entry.getValue());
			// so that other could be activated
			Thread.sleep(1000);
		}
	}
	
	//op:
	//when hashmap , we get concurrent modification exception 
	// but when concurrent hash map is used , succes
	// since concurrent hash map is synchronized and fail safe
	

}
