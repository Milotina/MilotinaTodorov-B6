package com.noorteck.java.hw20;

public class HomeworkQ13 {

	boolean isStartWith(String strOne, String strTwo) {

		boolean result = false;

		if (strOne.startsWith(strTwo)) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		HomeworkQ13 obj = new HomeworkQ13();

		boolean getResult1 = obj.isStartWith("java training", "ing");
		boolean getResult2 = obj.isStartWith("java training", "ja");
		boolean getResult3 = obj.isStartWith("java training", "java");
		boolean getResult4 = obj.isStartWith("java training", "train");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);

	}

}
/**
13. Write a method to check whether a given string starts with the contents(Characters) of
another string

Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isStartWith
Parameter1: String strOne
Parameter2: String strTwo 

*/