package week6homework;

import org.apache.http.util.CharArrayBuffer;

public class Stringcount {



	public static void main(String[] args) {
		String txt="Success";
		//String str=txt.toLowerCase();
		int len = txt.length();
		
		char[] charaarray = txt.toCharArray();
		
		int count=0;
		for (char ch : charaarray) {
			if(ch=='e') {
			
			count++;
								
			}
			
		}
		
		System.out.println(count);


	}
}

	//	