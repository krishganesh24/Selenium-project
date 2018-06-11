package week3homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxInArray {

	public static void main(String[] args) {

		///*To find the second maximum number in an integer array
		//code should work even when all the integers of the array is negative numbers.*/

		int num[] = {20,340, 21, 879, 92, 21,474,83647,-200,500};

		Arrays.sort(num);
		
		System.out.println("number"+num);
		List<Integer> list=new ArrayList<Integer>();

		for(int max:num)
		{
			list.add(max);
		}

		System.out.println("The second largest Number in an array is "+list.get((list.size())-2));
	}


}


