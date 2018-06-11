package week1day2assignment;

import java.util.Scanner;

public class FindMonthandDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {31,28,31,30,31,30,31,31,30,31,30,31};
		String []b= {"jan","Feb","Mar","Apr","May","June","Jul","Aug","sep","oct","nov","dec"};

		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		if (Num>0 && Num<13)
			System.out.println("Given month is="+ b[Num-1]+ "and No of days="+a[Num-1]);
		else

			System.out.println("invalidmonth");
		sc.close();
	}


}


