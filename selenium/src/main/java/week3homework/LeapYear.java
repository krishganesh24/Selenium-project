package week3homework;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year = ");
		
		int year=sc.nextInt();
		
		if ((year%400==0) || (year%4==0) && (year%100 !=0)){
			
		System.out.println("Entered year "+year+" is a leap year");	
		}
		

		else
			System.out.println("Entered year "+year+" is not a leap year");	

			sc.close();
		}
	}


