package week2homework;

import java.util.Scanner;

public class DivisiblebyThree_Five {

	public static void main(String[] args)  { 

		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter number n1 =");
		int n1 =sc.nextInt();
		System.out.println(" Enter number n2 =");
		int n2 =sc.nextInt();

		
		if (n1%3==0 && n2%3==0) {
			
			System.out.println(+n1+("FIZZ"));

			}
		
		else if (n1%5==0 && n2%5==0) {
			
			System.out.println(+n1+ ("BuZZ"));
			
			}
		
					
		else if (n1%3==0 && n2%5==0) {
			
			System.out.println(+n1  +n2+ ("FIZZ BUZZ"));
			
		}
		
		
		sc.close();
	}

	

}
