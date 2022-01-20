package com.noorteck.java.hw19;

public class HomeworkQ9 {

	private boolean isThere(String strOne, String value) {

		boolean result = false;

		if (strOne.contains(value)) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		HomeworkQ9 obj = new HomeworkQ9();

		System.out.println(obj.isThere("java training", "ini"));
		System.out.println(obj.isThere("java training", "ava"));
		System.out.println(obj.isThere("java training", "AVA"));
		System.out.println(obj.isThere("java training", "Java"));

	}

}
/**
 Write a method that takes two String parameters and the method checks if a given
String contains the specified sequence of character values. Return true if it contains the
value otherwise false

Access Modifier: private
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isThere
Parameter1: String strOne
Parameter2: String value
 
*/
