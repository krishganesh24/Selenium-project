package week6homework;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Give input");
		String input = sc.next();
		
		String low =input.toLowerCase();
		int count = 0;
				
		//String vo ="(.*[a,e,i,o,u,A,E,I,O,U].*$)";

		for (int i =0;i<low.length();i++) {
			
			char ch=low.charAt(i);
			
			if (ch=='a' || ch=='e' ||ch=='i'|| ch=='o'|| ch=='u') {
				count++;	
				
			}
		}
			
				
		
		System.out.println("Total no of vowels in "+input+"= "+count);

		sc.close();
	}

}
