package week4homework;

import java.util.Scanner;

public class MultiplesofThreeorFive {

	public static void main(String[] args) {


		int n1=3;
		int n2=5;
		int sum=0 ;


		Scanner sc = new Scanner(System.in);
		System.out.println("enter i/p to sum of till:");
		int in=sc.nextInt();



		for (int i=n1; i<in;i++) {


			if(i%n1==0 || i%n2==0) {
				sum += i;


			}
		}
		sc.close();

		System.out.println("Sum of multiples of 3 or 5 till "+in+" is="+sum);

	}
}
