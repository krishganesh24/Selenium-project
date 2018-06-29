package week6homework;

import java.util.HashMap;
import java.util.Map;

public class MapLearnings {

	public static void main(String[] args) {
		// To find duplicate character in string and count of character each
		
		String name ="AMAZON";
		
	Map<Character,Integer> data = new HashMap<Character,Integer>();

		 String name1 =name.replace(" ","" );
		 //System.out.println(name1);
		 
		 char[] chararray = name1.toCharArray();
		 
		 for ( char ch : chararray) {
			 
			 if(data.containsKey(ch)) {
				 
				 Integer count = data.get(ch);
				 data.put(ch, count+1);
				 
				 
				 
				 
				 System.out.println("The character"+ch+" is duplicate");
					 
				 
			 }
			 else {
				 data.put(ch, 1);
				 
				 
				 
			 }
			
			 
			 
		}

		 System.out.println(data);
		 
			}
}
