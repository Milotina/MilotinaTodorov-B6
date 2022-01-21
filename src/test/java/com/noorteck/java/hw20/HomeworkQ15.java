package com.noorteck.java.hw20;

public class HomeworkQ15 {

	public static String removeSpace(String strOne) {

		String result = "";

		result = strOne.trim();

		return result;
	}

	public static void main(String[] args) {

		String getResult1 = removeSpace(" Java Training ");
		String getResult2 = removeSpace(" I like to practice ");

		System.out.println(getResult1);
		System.out.println(getResult2);

	}

}
/**
 15. Write a method to trim any leading or trailing whitespace from a given string

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeSpace
Parameter1: String strOne
 
*/