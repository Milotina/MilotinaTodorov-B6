package com.noorteck.java.hw20;

public class HomeworkQ18 {

	public String getNewStr(String strOne, String strTwo) {

		String result = "";

		if (strOne.length() > strTwo.length()) {
			result = (strOne.substring((strOne.length() - strTwo.length()), strOne.length())).concat(strTwo);
		} else if (strOne.length() < strTwo.length()) {
			result = strOne.concat((strTwo.substring((strTwo.length() - strOne.length()), strTwo.length())));
		} else if (strOne.length() == strTwo.length()) {
			result = strOne.concat(strTwo);
		}

		return result;

	}

	public static void main(String[] args) {

		HomeworkQ18 obj = new HomeworkQ18();

		String getResult1 = obj.getNewStr("Welcome", "home");
		String getResult2 = obj.getNewStr("Java", "door");
		String getResult3 = obj.getNewStr("cooking", "pasta");
		String getResult4 = obj.getNewStr("Pro", "gress");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);

	}

}
/**
18. Write a method that takes two string parameters. The method append them together
and return the result. If the strings are different lengths, omit chars from the beginning
of longer string and make them equal length

Access Modifier: public
Non-Access Modifier: non-static
Return Type: String
Method Name: getNewStr
Parameter1: String strOne
Parameter2: String strTwo
*/