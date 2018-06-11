package week1day2assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get the n the number to print the fibonacci series

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the no : ");
		int n = sc.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		int sum;
		System.out.println(" Fibonacci series is : ");
		while (fib1 <= n)

		{
			System.out.print(fib1+ " ");
			sum = fib1 + fib2;
			fib1 = fib2;
			fib2 = sum;
		}
		sc.close();
	}

}
