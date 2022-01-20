package com.noorteck.java.hw19;

public class HomeworkQ6 {

	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {

		String result1 = strOne.toUpperCase() + strTwo.toLowerCase();
		String result2 = strThree.toUpperCase() + strFour.toLowerCase();
		String result3 = result1.concat(result2);

		return result3;

	}

	public static void main(String[] args) {

		String getResult1 = combineStr("day", "ONE", "work", "HOURS");
		String getResult2 = combineStr("week", "weekend", "monday", "Tuesday");
		String getResult3 = combineStr("restoN", "vA", "baltiMORE", "MD");
		String getResult4 = combineStr("java", "is", "fun", "LEARNING");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);

	}

}
/**
Write a method that takes four String parameters, the method
a. converts parameter 1 and parameter 3 to uppercase,
b. converts parameter 2 and parameter 4 to lower case
c. Then the method concatenates all four parameters and return the new String
value.

Access Modifier: protected
Non-Access Modifier: static
Return Type: String
Method Name: combineStr
Parameter1: String strOne
Parameter2: String strTwo
Parameter3: String strThree
Parameter3: String strFour
*/
