package week1day2assignment;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		// Get the number to calculate factorial//

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the no : ");
		int n=sc.nextInt();
		int i,fac=1;

		for (i=1;i<=n;i++)
		{
			fac=fac*i; 

		}

		System.out.println(" factorial of" + n + "is :"+fac);

		sc.close();

	}

}
