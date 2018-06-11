package week2homework;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// to find the prime no list for the given n

		// Getting N value

		Scanner num = new Scanner(System.in);
		System.out.println(" enter the no : ");
		int n=num.nextInt();
		String primeno= ("");

		for(int i=2;i<=n;i++)
		{

			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{

					primeno=primeno + i + " ";
				}

				if(i%j==0)
				{
					break;
				}	



				num.close();

			}
		}

		System.out.println(" Prime Numbers are:"+primeno);
	}




}









