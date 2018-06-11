/*1.Write a Java Program to get 3 user inputs 
		Two Numbers 
		One String which can be either of the below “Add”/”Subtract”/“Multiply”/”Divide”
		2. Perform the equivalent arithmetic operation.
		3. Print the result in the console.*/



package week2homework;

import java.util.Scanner;

public class ArithmaticByString {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter numbers n1& n2 :");
		int n1=sc.nextInt();
		int n2= sc.nextInt();
		System.out.println(" Enter Operations to perform :(Add/Sub/mod/Div)");
		String opr=sc.next();

		int a,s,m,d;

		switch (opr) {

		case("add"):

			a= n1+n2;
		System.out.println("sum of n1 & n2="+a);
		break;

		case ("sub"):
			s=n1-n2;
		System.out.println("Subtraction of n1 & n2="+s);
		break;

		case("mul"):
			m=n1*n2;

		System.out.println("Multiplication of n1 & n2="+m);
		break;
		case("div"):
			if(n2!=0) {

				d=n1/n2;
				System.out.println("division of n1 & n2="+d);
			}
			else {

				System.out.println("Division cannot be performed as n2 is zero");
			}
		break;
		default:

			System.out.println("invaliddata");



		}


		sc.close();

	}

}
