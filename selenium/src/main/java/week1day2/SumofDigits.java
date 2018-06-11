package week1day2;

public class SumofDigits {

	public static void main(String[] args) {
		
		//get the data in to array

		int []array = {10,20,30};
		int sum=0;
		for (int num: array)
		{
			sum= sum+num;
		}

		//print the data
		System.out.println("sum of digits="+sum);

	}

}
