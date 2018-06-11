package week6homework;

public class StringSwap {

	public static void main(String[] args) {


		String str1 ="Ganesh";
		String  str2="krish";

		System.out.println("Before Swap :a= "+str1+" and b= "+str2+" ");
	  str1=str1+str2; //Ganeshkrish
// Swap for Str2
			str2=str1.substring(0,(str1.length()-str2.length()));
		
//Swap for str1
			str1=str1.substring(str2.length());
			
		System.out.println("Before Swap :a= "+str1+" and b= "+str2+" ");
	}
}
