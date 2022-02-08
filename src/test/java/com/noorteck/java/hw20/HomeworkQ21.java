package com.noorteck.java.hw20;

public class HomeworkQ21 {

	static String repeatChar(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {

			result = result + str.substring(i, i + 1) + str.substring(i, i + 1);

		}

		return result;
	}

	public static void main(String[] args) {

		String getResult1 = repeatChar("welcome");
		String getResult2 = repeatChar("Viorica");
		String getResult3 = repeatChar("Abdul");
		String getResult4 = repeatChar("Malek");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);
	}

}
/**
21. Write a method that takes one string parameter. Method should repeat every character
twice in the original string and return the new value

Access Modifier: default
Non-Access Modifier: static
Return Type: String
Method Name: repeatChar
Parameter1: String str
*/