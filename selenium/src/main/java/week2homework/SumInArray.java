package week2homework;


import java.util.Scanner;

public class SumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int num= sc.nextInt();//3

		int arr[]=new int[num]; 
		System.out.println("Enter the numbers:");

		int sum=0;
		
		for (int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];

		}

		System.out.println("sum of digits=" + sum);


		sc.close();
	}
}

