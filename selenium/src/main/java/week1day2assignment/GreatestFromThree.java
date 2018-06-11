 package week1day2assignment;

import java.util.Scanner;

public class GreatestFromThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To get the numbers
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		// to check the greatest no by using > operator.

		if (a>b && a>c) 
		{
			System.out.println(a +"is a Greatest no");	
		}

		else if ( b>c)
		{

			System.out.println(b +"is a Greatest no");	
		}
		else 
		{
			System.out.println(c +"is a Greatest no");	
		}

		sc.close();

	}

}


