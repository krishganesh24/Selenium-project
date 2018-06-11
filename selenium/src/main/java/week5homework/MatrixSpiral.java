package week5homework;

import java.util.Scanner;

import org.testng.annotations.Test;

public class MatrixSpiral {

	
	@Test
	public void test() {
	//public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the spiral matrix number1 n1");
	int n1=sc.nextInt();
			
	System.out.println("Enter the spiral matrix number2 n2");
	int n2=sc.nextInt();
	
	
	 for (int i=1;i>n1;i++) {
		 
		 for(int j=1;j>n2;j++) {
			 
			 System.out.println(n2);
		 }
	 }
	
	sc.close();
	
	
		
		

	}

}
