package com.noorteck.java.hw19;

public class HomeworkQ4 {

	String toUpper(String strOne) {

		String result = strOne.toUpperCase();
		return result;

	}

	public static void main(String[] args) {

		HomeworkQ4 obj = new HomeworkQ4();
		
		System.out.println(obj.toUpper("Pro"));
		System.out.println(obj.toUpper("java"));
		System.out.println(obj.toUpper("java training"));
	}

}
/**
 Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
 
*/