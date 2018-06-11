package week3homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNo_Array {

	public static void main(String[] args) {

		
		
int a[]={13,65,15,67,88,65,13,99,67,13,65,87,13,20,20,20};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					set.add(a[i]);
				}
			}
		}

		System.out.println("Duplicated Numbers in an arrays are "); 
		
		
		
		List l=new ArrayList<Integer>();
		l.addAll(set);
		
		int b[]=new int[l.size()];
		
		for(int i=0;i<set.size();i++)
		{
			b[i]=(int) l.get(i);
		}
	
		Arrays.sort(b);
		
		for(int i=0;i<set.size();i++)
		{
			System.out.println(b[i]);
		}
		
	}

}

		
		

