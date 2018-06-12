package week6homework;

import java.util.regex.Pattern;

public class Stringmatches {

	public static void main(String[] args) {

		String s1 = "12345";
		String s2 = "123456";
		String s3 = "123.45";
		String p="[\\d]{6}";
		
		System.out.println("Input: "+s1+"\tOutput : "+Pattern.matches(p, s1));
		System.out.println("Input: "+s2+"\tOutput : "+Pattern.matches(p, s2));	
		System.out.println("Input: "+s3+"\tOutput : "+Pattern.matches(p, s3));
		
	boolean out=	Pattern.matches(p, s3);
	
	
	System.out.println(out);
	}

}
