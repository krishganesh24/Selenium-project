package week1day2assignment;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Get the input values

		int a;//5
		int b;//3
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter i/p 1:");
		a=sc.nextInt();
		System.out.println("Enter i/p 2:");
		b=sc.nextInt();
//Multiply the input1 value till i/p2 value  
		for(int i=1;i<=b;i++)

		{
			int value= i*a;
			System.out.println(i+"*"+a+"="+value);
		}
sc.close();
	}




}


