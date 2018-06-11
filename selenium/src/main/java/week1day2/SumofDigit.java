package week1day2;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		long sum=0;
		long value;
		long reminder=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		long num=sc.nextLong();

		while (num>0) {

			value=num/10;
			reminder=num%10;
			num=value;
			sum=reminder+sum;

		}

		System.out.println("Sum of digits:"+sum);
		sc.close();
	}

}
