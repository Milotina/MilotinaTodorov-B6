package com.noorteck.java.hw20;

public class HomeworkQ19 {

	public static boolean isSame(String strOne) {

		boolean result = false;

		if ((strOne.substring(0, 2)).equals(strOne.substring(strOne.length() - 2))) {
			result = true;
		}

		return result;

	}

	public static void main(String[] args) {

		boolean getResult1 = isSame("educated");
		boolean getResult2 = isSame("modified memo");
		boolean getResult3 = isSame("I am studying");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);

	}

}
/**
 19. Write a method to return true from a given string if the first two characters in the string
also appear at the end

Access Modifier: public
Non-Access Modifier: static
Return Type: boolean
Method Name: isSame
Parameter1: String strOne
*/