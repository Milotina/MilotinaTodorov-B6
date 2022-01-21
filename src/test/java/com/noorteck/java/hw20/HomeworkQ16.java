package com.noorteck.java.hw20;

public class HomeworkQ16 {

	String concatString(String strOne, String strTwo) {

		String result = "";

		if (strOne.charAt(strOne.length() - 1) == strTwo.charAt(0)) {
			result = strOne + strTwo.substring(1);
		} else {
			result = strOne + strTwo;
		}

		return result;

	}

	public static void main(String[] args) {

		HomeworkQ16 obj = new HomeworkQ16();

		String getResult1 = obj.concatString("Java", "awesome");
		String getResult2 = obj.concatString("food", "door");
		String getResult3 = obj.concatString("java", "training");
		String getResult4 = obj.concatString("Pro", "ogress");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);
	}

}
/**
 16. Write a method to concatenate two given strings such that, if the concatenation creates
a double characters then removes one of the characters.
a. For example strOne = “food”; strTwo =”door”. After concatenating two
strings it will give us “fooddoor”(dd is double character, remove one of the
d) then the string after concatenation are: “foodoor”

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: concatString
Parameter1: String strOne
Parameter2: String strTwo
 
*/