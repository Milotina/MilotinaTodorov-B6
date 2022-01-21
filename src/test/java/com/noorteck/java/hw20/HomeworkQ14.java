package com.noorteck.java.hw20;

public class HomeworkQ14 {

	public static String getSubStr(String str, int startingIndex, int endingIndex) {

		String result = "";

		result = str.substring(startingIndex, endingIndex);

		return result;
	}

	public static void main(String[] args) {

		String getResult1 = getSubStr("java training", 2, 6);
		String getResult2 = getSubStr("Software Development Engineer in TEST", 11, 23);
		String getResult3 = getSubStr("Software Development Engineer in TEST", 21, 29);

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
	}

}
/**
 14. Write a method to get a substring of a given string between two specified positions.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: getSubStr
Parameter1: String str
Parameter2: Int startingIndex
Parameter2: Int endingIndex
 
*/