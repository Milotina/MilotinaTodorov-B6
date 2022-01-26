package com.noorteck.java.hw22;

public class HomeworkQ2 {

	boolean isEndWith(String strOne, String strTwo) {

		boolean result = false;

		if (strOne != null && strTwo != null && strOne.endsWith(strTwo)) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		HomeworkQ2 obj = new HomeworkQ2();

		boolean getResult1 = obj.isEndWith("java training", "ing");
		boolean getResult2 = obj.isEndWith("java training", "ng");
		boolean getResult3 = obj.isEndWith("java training", "java");
		boolean getResult4 = obj.isEndWith("java training", "train");
		boolean getResult5 = obj.isEndWith(null, "java");
		boolean getResult6 = obj.isEndWith(null, null);
		boolean getResult7 = obj.isEndWith("aaabc", "abc");
		boolean getResult8 = obj.isEndWith("abc", null);

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);
		System.out.println(getResult5);
		System.out.println(getResult6);
		System.out.println(getResult7);
		System.out.println(getResult8);
	}

}
/**
2. Write a method to check whether a given string ends
with the contents(Characters) of another string
Access Modifier: default
Non-Access Modifier: non-static
Return Type: boolean
Method Name: isEndWith
Parameter1: String strOne
Parameter2: String strTwo 
 
*/