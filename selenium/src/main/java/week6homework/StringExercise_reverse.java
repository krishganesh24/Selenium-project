package week6homework;

import org.apache.http.util.CharArrayBuffer;

public class StringExercise_reverse {

	

	public static void main(String[] args) {
String txt="Success";
		int len = txt.length();
		char[] charaarray = txt.toCharArray();
		for(int i=len-1;i>=0;i--) {
			
			System.out.print(charaarray[i]);
		}	}
		
}
//	