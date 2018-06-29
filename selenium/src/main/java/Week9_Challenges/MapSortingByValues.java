package Week9_Challenges;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.comparators.ComparableComparator;

public class MapSortingByValues {

	public static void main(String[] args) {

		Map<String,Integer> inputmap = new HashMap<String,Integer>();
		inputmap.put("Twenty one", 21);
		inputmap.put("thirty one", 31);
		inputmap.put("fifty one", 51);
		inputmap.put("seventy one", 71);
		inputmap.put("forty one", 41);
		inputmap.put("Eleven", 11);
		
		System.out.println(inputmap);
		Comparator<Object> comp = new CustomComparator(inputmap);
		
		Map<String,Integer> outmap = new TreeMap<String,Integer>(comp);
		
		outmap.putAll(inputmap);
		
		System.out.println(outmap);
		
	}
}

		
		
		class CustomComparator implements Comparator<Object> {
			Map<String, Integer> map;
			public CustomComparator(Map<String, Integer> map) {
				this.map = map;
			}
			@Override
			public int compare(Object o1, Object o2) {
				return map.get(o1).compareTo(map.get(o2)) == 0 ? 1 : map.get(o1).compareTo(map.get(o2));
			}
			
		
		
		
	}


