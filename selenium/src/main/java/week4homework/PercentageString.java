package week4homework;

import java.util.Scanner;


public class PercentageString {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the string:");
		String data = sc.nextLine();

		
		int dig = 0;
		int upp=0;
		int lower=0;
		char value=0;
		int sp=0; 
		int allchar=data.length();
		//String str=data;
				
		for (int i=0;i<data.length();i++) {

			value=data.charAt(i);

			if(Character.isDigit(value)) {
				
				dig++;
			}

			if(Character.isUpperCase(value)) {
				upp++;

			}

			if(Character.isLowerCase(value)) {
				lower++;
			}
			
			else {
					sp++;
		}
		}
		System.out.println("Total no of character in string :"+allchar+" ");
		System.out.println("No of Upper case in the String is"+upp+" and Percentage of uppercase:"+((upp*100)/allchar));
		System.out.println("No of Lower case in the String is"+lower+" and Percentage of lowercase:"+((lower*100)/allchar));
		System.out.println("No of Upper case in the String is"+dig+" and Percentage of Digits:"+((dig*100)/allchar));
		System.out.println("No of other characters is "+(sp=(allchar-(upp+lower+dig)))+" and  Percentage is:" +((sp*100)/allchar));

sc.close();
	} 
}
