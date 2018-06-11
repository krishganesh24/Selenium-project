package week1day2assignment;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get the no of elements in the array
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int num= sc.nextInt();
		
		int arr[]=new int[num];
		
		System.out.println("Enter the numbers");

		// get the numbers in to the array
		
		for (int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		//System.out.println("List of elments"+arr.toString());
		int temp;
		System.out.println("List of elments befre"+Arrays.toString(arr));
		for(int j=0;j<arr.length;j++)
		{
			for (int i=0;i<arr.length-1;i++)
			{
				
				if (arr[i]>arr[i+1])
				{
					
					 temp=arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
					 
				}				 
				
			}
		}
		/*for (int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					int temp;
					 temp=arr[j];
					 arr[j]=arr[i];
					 arr[j]=temp;
					 
				}
			}
				 
			
		}*/

		System.out.println("List of elments aftrr"+Arrays.toString(arr));

		sc.close();
	}	
		
	}


