package sample;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortByValue {

	public static void main(String[] args) {
		
		Map<String,Integer> map=new HashMap<>();
		map.put("a", 5);
		map.put("b", 3);
		map.put("c", 6);
		map.put("d", 1);
		
		LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
				.sorted((a,b)->{return a.getValue()-b.getValue();}) // asceding order
				.collect(Collectors									
				.toMap(Map.Entry::getKey		
					  ,Map.Entry::getValue
					  ,(a,b)->a					// if both equal the take first (1,1)->1
					  ,LinkedHashMap::new));	// covert to linked hash map , why ? preserve insertion order
		
		System.out.println(sortedMap);
		
	}

}
