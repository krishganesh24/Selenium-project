package day1;

import java.util.Scanner;

public class FirstProgram {

	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int num1=0,num2=1,sum;
				int uNum;
				
				Scanner inPut = new Scanner(System.in);
				System.out.println("Enter the value to generate Fibonacci series :");
				uNum = inPut.nextInt();
				
				
				
				//or(int i=0;i<uNum;i++)
				
				while(num1 <= uNum)
				{
						System.out.print(num1+" ");
						sum=num1+num2;
						num1=num2;
						num2=sum;

				}
				
				System.out.println("The Fibonacci series for given number is :");
				inPut.close();
				
			}		
	

	}


