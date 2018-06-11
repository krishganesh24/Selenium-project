package week4homework;

import java.util.Scanner;

public class PasswordValidations {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your password: ");
		String password=sc.next();
		String spchar;
		int dig=0;
		//String uppercase;

		boolean valid = true ;
				
		if(password.length()<10) {

			System.out.println("Password length is too short. please set password minimum 10 characters");

			valid =false;

		}	

		// To check if password has 2 digits
		char value;
		for(int i = 0; i <password.length(); i++ ){

			value = password.charAt( i );

			if( Character.isDigit(value) ){
				dig++;
			} 

		} 

		System.out.println("no of digits in password:"+dig);
		if( dig < 2 ){

			System.out.println("Password Should contain atleast 2 digits ");
			valid=false; 
		}
		//		
		char valuelet = 0;
		int let=0;
		int up = 0;

		for (int i=0;i<password.length();i++) {

			valuelet=password.charAt(i);
			//if(Character.isLowerCase(valuelet) && (Character.isUpperCase(valuelet))){
			if(Character.isAlphabetic(valuelet)) {

				let++;

				if(Character.isUpperCase(valuelet)) {
					up++;

				}
			}

		}
		System.out.println("no of letters in password:"+let);

		if( let < 2 ){

			System.out.println("Password Should contain atleast 2 letters");

			valid=false; 
		}
		if(up<=0) {

			System.out.println("Password should contain one Upper case minimum");
			valid =false;


		}


		spchar="(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";

		if(password.matches(spchar)) 
		{
			System.out.println("Password should contains only letters and digits. no special chars allowed");
			valid=false;

		}

		//			uppercase="(.*[A-Z].*)";
		//			if (!password.matches(uppercase)) {
		//
		//				System.out.println("Password should contains atleast one capital letter");
		//				valid=false;
		//
		//			}

		//dig="(.*[0-9].*)";
		//lowercase="(.*[a-z].*)";
		//if// (password.matches(dig))

		
		if(valid) {

			System.out.println("valid password");
	}
		sc.close();
	}


}
