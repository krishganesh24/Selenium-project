package week1day2assignment;

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int reverse=0;
		int reminder;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();

		while (num>0) {

			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;		

		}

		System.out.println("Reverse No is:" + reverse);

		sc.close();

	}

}
