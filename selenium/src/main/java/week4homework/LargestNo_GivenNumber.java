package week4homework;

import java.util.Scanner;

public class LargestNo_GivenNumber {
	
	public static void main(String[] args) {

		int num;
		int n;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number Num=");
		num=sc.nextInt();
		
		System.out.println("Enter the Digit(1-9) n=");
		n= sc.nextInt();
		
		sc.close();
		while (Integer.toString(num).contains(Integer.toString(n))) {
			
			 num--;
		}
				System.out.println("Largets Number="+num);
				
				
				
		
		
		}

		
		

}
