package week6homework;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHomeWork {

	public static void main(String[] args) {

		//sum of digits in string		
		String txt = "The company infosys india having 1,24,000 and no of emp in North america is 4040";

		String[] rep = txt.split(" ");

		/*for (int i = 0; i < rep.length; i++) {
			System.out.println(rep[i]);
		}
		 */
		/*int count=0;
			for (int i = 0; i < rep.length; i++) {
				String pat="[0-9]";
				Pattern p= Pattern.compile(pat);
				Matcher m= p.matcher(rep[i]);
				if(m.find()== true){
					//System.out.println(rep[i]);
					count=count+Integer.parseInt(rep[i].replaceAll(",", ""));

				}*/
		//}

		//System.out.println(count);

		int count=0;				
		for(String arr:rep) {

			String pat="[0-9]";
			Pattern p= Pattern.compile(pat);
			Matcher m= p.matcher(arr);
			if(m.find()== true){
				count=count+Integer.parseInt(arr.replaceAll(",", ""));

			}

		}
	
		System.out.println(count);
	}
	
}

