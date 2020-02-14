package com.epam.edp.demo;

import java.util.regex.Pattern;

public class RegexReceiver {

    public static final String EMAIL_PATTERN_STRING = "@gmail"; //change string inside the parentheses

    private static Pattern emailPattern;


    static boolean isEmail(String s) {
        if (emailPattern == null) {
            emailPattern = Pattern.compile(EMAIL_PATTERN_STRING);
        }
        return emailPattern.matcher(s).matches();
    }

    public static void main(String[] args) {
        //you can test your code here before sending it to the review
    }

}
