package week3homework;

import java.util.Scanner;

public class AmstriongNo {

	public static void main(String[] args) {

		int cube=0;
		int rem;

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number between 100 to 999 =");
		int n = sc.nextInt();
		int num=n;
		while (n>0)
		{

			rem=n%10;
			cube=cube+(rem*rem*rem);
			n=n/10;


		}


		if (num==cube)
		{
			System.out.println("Given Number "+num+" is a Amstrong number");
		}

		else


			System.out.println("Given Number "+num+" is not a Amstrong number");

		sc.close();	 
	}

}
