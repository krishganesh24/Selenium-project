package week3homework;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {

		int n=1;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the number No of Rows for floyds triangle:");

		//Copying user input into an integer variable named rows

		int num=sc.nextInt();

		System.out.println("Floyds Trianngle");
		System.out.println("****************************");


		for (int i=1;i<=num;i++)
		{
			for (int j=1;j<=i;j++)

			{
				System.out.print(n+" ");
				//Incrementing the number value
				n++;
			}

			System.out.println();
			
		}

		System.out.println("************************");


		sc.close();

	}

}
