package javaconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdaForEachExample {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.forEach((a)->System.out.println(a));
		
		Map<Integer,Integer> map=new HashMap<>();
		
		map.put(1, -1);
		map.put(2, -2);
		map.put(3, -3);
		
		map.forEach((k,v)->System.out.println(k+" "+v));

	}

}
