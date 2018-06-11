package week1day2;

import java.util.Scanner;

public class GetData {

	public static void main(String[] args) {


		Scanner get= new Scanner(System.in);
		System.out.println("Enter ur rollno:");
		int rollno=get.nextInt();
		System.out.println("ur rollno:"+rollno);
		System.out.println("enter ur name:");
		String name=get.next();
		System.out.println("ur name is:"+name);

	
	get.close();
	}
	

}
