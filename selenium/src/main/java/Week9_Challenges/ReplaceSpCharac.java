package Week9_Challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceSpCharac {

	public static void main(String[] args) {

		String a = "{Java}/\\*Selenium)";
		

		System.out.println(a.replaceAll("[\\W]", "")); 

		System.out.println(a.replaceAll("[^A-Za-z0-9]", ""));
		

	}

}
