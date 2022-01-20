package com.noorteck.java.hw19;

public class HomeworkQ5 {

	protected String toLower(String strOne) {

		String result = strOne.toLowerCase();
		return result;
	}

	public static void main(String[] args) {

		HomeworkQ5 obj = new HomeworkQ5();

		System.out.println(obj.toLower("espn"));
		System.out.println(obj.toLower("SOCCER"));
		System.out.println(obj.toLower("STRING CLASS"));

	}

}
/**
 Write a method that takes one String parameter and the method converts the
parameter to lowercase and return the new String value

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: toLower
Parameter1: String strOne
 
*/
