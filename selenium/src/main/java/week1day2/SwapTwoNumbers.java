package week1day2;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		System.out.println("before swap a="+a +"b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap a="+a +"b="+b);
	}

}
