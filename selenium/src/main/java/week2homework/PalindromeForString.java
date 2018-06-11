//Palindrome for String . Ex: madam .In reverse also if it prints it will show madam.

package week2homework;

import java.util.Scanner;

public class PalindromeForString {

	public static void main(String[] args) {



		// get the i/p as a string.

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to check if its a palnidrome:");
		String a = sc.next();
		String b="";
		int l =a.length();
		for ( int i=l-1;i>=0;i--)
		{
			b=b+a.charAt(i);

		}	
		 
		if (a.equalsIgnoreCase(b))
		{		
			System.out.println("Given string is palindrom");
		}
		
		else		
		{
			System.out.println("Given string is not palindrome.");
		}

		sc.close();
	}

}


