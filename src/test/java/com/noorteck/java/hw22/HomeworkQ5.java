package com.noorteck.java.hw22;

public class HomeworkQ5 {

	public static String removeSpace(String strOne) {

		String result = "";

		if (strOne != null) {
			result = strOne.trim();
		} else {
			result = null;
		}
		
		return result;
	}

	public static void main(String[] args) {

		String getResult1 = removeSpace(null);
		String getResult2 = removeSpace(" Java Training ");
		String getResult3 = removeSpace(" I like to practice ");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);

	}

}
/**
 5. Write a method to trim any leading or trailing whitespace from a given string

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
 
*/