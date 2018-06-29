package Week9_Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapAscending {

	public static void main(String[] args) {

		
		HashMap<Integer, String> data = new HashMap<Integer,String>();
		
		data.put(65, "sixtyfive");
		data.put(21,"Twenty One");
		data.put(48, "Forty Eight");
		data.put(31, "Thirty one");
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(data);
		
		for (Entry<Integer,String> s :treeMap.entrySet()) {
			
			System.out.println(s.getKey()+"  "+s.getValue());
			
			
		}
		
		
	}

}
