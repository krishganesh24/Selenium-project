package day1;

public class StringtoInt {

	public static void main(String[] args) {
		// 
		String n1 =("?58,999");
		String n2 =("?29,999");

		
		n1.replace("", "").replace(",", "");
		
		
		int num = Integer.parseInt(n1.replace("", "").replace(",", ""));
		//int num2 = Integer.valueOf(n2);
		
		//int a=Integer.getInteger(n1);
		//int a=Integer.parseInt(n1);
		
		
		System.out.println(num);
		//System.out.println(num2);
		//System.out.println(a);
	}

}
