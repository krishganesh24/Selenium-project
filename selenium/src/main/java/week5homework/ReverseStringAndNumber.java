package week5homework;

public class ReverseStringAndNumber {

	public static void main(String[] args) {

		String str ="Ganesh Krishnamoorthy";
		String reversed=  reverseString(str);
		System.out.println("The reversed string is: " + reversed);
		int number= 987654321;
		System.out.println("The reversed Number : ");
		revNum(number);
		//System.out.println();
	}

	public static void revNum(int number) {

		if(number<10) {
			System.out.println(number);
			return;
		}
		else {
			System.out.print(number% 10);
			revNum(number/10);
		}


	}

	private static String reverseString(String str) {

		if(str.isEmpty()) 			
			return str;

		// calling function
		//System.out.println(str.substring(1) + " "+str.charAt(0));
		return reverseString(str.substring(1))+str.charAt(0);

	}

}
