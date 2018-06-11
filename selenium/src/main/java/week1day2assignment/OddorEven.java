package week1day2assignment;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		// To get data using scanner method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int number=sc.nextInt();
		// to idendify the number is odd or even
		if(number%2==0)
			System.out.println("Given Number is even");
		else
			System.out.println("Given Number is odd");
sc.close();


	}

}
