package week1day2assignment;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rev=0;
		int rem;
		int value;
		Scanner sc= new Scanner(System.in);
		// Get the Number
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		value=num;

		while (num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;

		}
		// To check if its a palindrome
		if (rev==value) {
			System.out.println("Given number is Palindrome Number");

		}
		else {

			System.out.println("Given number is Not a Palindrome Number");
		}

sc.close();
	}

}
