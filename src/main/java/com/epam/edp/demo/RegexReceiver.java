package com.epam.edp.demo;

import java.util.regex.Pattern;

public class RegexReceiver {
	
	private static final Pattern EMAIL_PATTERN = Pattern.compile("@gmail");	//change string inside the parentheses
	
	
	static boolean isEmail(String s) {
		return EMAIL_PATTERN.matcher(s).matches();
	}
	
	public static void main(String [] args) {
		//you can test your code here before sending it to the review
	}

}
