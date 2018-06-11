package week5homework;

import java.util.Scanner;

public class UniqueCharString {

	public static void main(String[] args) {

		// Java Program to idendify& form a String with Unique Characters
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = sc.nextLine();
	//char b[]=str.toLowerCase().replace(" ", "").toCharArray();
	//String input=str.replaceAll("\\s","");
	String input1=str.toLowerCase().replaceAll("\\s","");
	System.out.println("input ="+input1);
	int size= input1.length();
	System.out.println("String size"+size);
	String output="";
	
	for (int i=0;i<size;i++) {
		
		int temp= output.indexOf(input1.charAt(i));
		
	if (temp==-1){
			
			output=output+input1.charAt(i);
		}
	
	}
	sc.close();
	System.out.println(output);		
	
	}


}


