package com.noorteck.java.hw20;

public class HomeworkQ20 {

	public static String removeT(String strOne) {

		String result = "";

		if ((strOne.substring(0, 1)).equalsIgnoreCase("t")) {
			strOne = strOne.substring(1);
		}

		int lastIndex = strOne.length() - 1;

		if ((strOne.substring(lastIndex)).equalsIgnoreCase("t")) {
			strOne = strOne.substring(0, lastIndex);
		}

		result = strOne;

		return result;

	}

	public static void main(String[] args) {

		String getResult1 = removeT("Test Data");
		String getResult2 = removeT("Testcricket");
		String getResult3 = removeT("I am studying");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
	}

}
/**
20. Write a method that takes a string parameter. Check if the first or last characters in the
string parameter are 't', return the string without those 't' otherwise return the string
unchanged.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: removeT
Parameter1: String strOne
*/