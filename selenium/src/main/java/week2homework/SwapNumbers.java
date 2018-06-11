package week2homework;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		Scanner sc= new Scanner (System.in);

		System.out.println(" Enter number a =");
		int a =sc.nextInt();
		System.out.println(" Enter number b =");
		int b =sc.nextInt();
		a=a+b;
		b=a-b; 
		a=a-b; 
		System.out.println(" Value of a after swap="+a);
		System.out.println(" Value of b after swap =" +b);
		sc.close();
	}


}
