package com.noorteck.java.hw22;

public class HomeworkQ1 {

	String toUpper(String strOne) {

		String result = "";

		if (strOne != null) {
			result = strOne.toUpperCase();
		} else {
			result = null;
		}
		return result;

	}

	public static void main(String[] args) {

		HomeworkQ1 obj = new HomeworkQ1();

		System.out.println(obj.toUpper("Pro"));
		System.out.println(obj.toUpper("java"));
		System.out.println(obj.toUpper(null));
	}

}
/**
 1. Write a method that takes one String parameter and the method converts the
parameter to uppercase and return the new String value

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: toUpper
Parameter1: String strOne
 
*/