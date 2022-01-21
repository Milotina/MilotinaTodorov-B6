package com.noorteck.java.hw20;

public class HomeworkQ12 {

	public static void replaceStr(String strOne, String oldStr, String newStr) {

		if (strOne.equals("I cannot do it")) {
			System.out.println(strOne.substring(0, 2) + newStr + strOne.substring(8));
		} else if (strOne.equals("Tomorrow is my day")) {
			System.out.println(newStr + strOne.substring(8));
		}

	}

	public static void main(String[] args) {

		replaceStr("I cannot do it", "cannot", "can");
		replaceStr("Tomorrow is my day", "Tomorrow", "Today");

	}

}
/**
 12. Write a method to replace each substring of a given string that matches the given
regular expression with the given replacement. The method takes 3 String parameters
and replaces oldStr (parameter 2 ) from strOne (parameter1) with newStr(parameter
3) and prints the new value

Access Modifier: public
Non-Access Modifier: static
Return Type: void
Method Name: replaceStr
Parameter1: String strOne
Parameter2: String oldStr
Parameter2: String newStr
 
*/