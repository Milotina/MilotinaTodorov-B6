package com.noorteck.java.hw22;

public class HomeworkQ4 {

	public static String getSubStr(String str, int startingIndex, int endingIndex) {

		String result = "";

		if (str != null) {
			result = str.substring(startingIndex, endingIndex);
		} else {
			result = null;
		}

		return result;
	}

	public static void main(String[] args) {

		String getResult1 = getSubStr(null, 2, 6);
		String getResult2 = getSubStr("java training", 2, 6);
		String getResult3 = getSubStr("Software Development Engineer in TEST", 11, 23);
		String getResult4 = getSubStr("Software Development Engineer in TEST", 21, 29);

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);
	}

}
/**
 4. Write a method to get a substring of a given string between two specified positions.

Access Modifier: public
Non-Access Modifier: static
Return Type: String
Method Name: getSubStr
Parameter1: String str
Parameter2: Int startingIndex
Parameter2: Int endingIndex
 
*/