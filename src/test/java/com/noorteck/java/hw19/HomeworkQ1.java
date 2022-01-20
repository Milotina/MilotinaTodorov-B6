package com.noorteck.java.hw19;

public class HomeworkQ1 {
	
	static boolean isEqual(String strOne, String strTwo) {

		boolean result = false;

		if (strOne.equals(strTwo)) {
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		boolean getResult1 = isEqual("sdet", "SDET");
		boolean getResult2 = isEqual("testing", "testing");
		boolean getResult3 = isEqual("java", "java");
		boolean getResult4 = isEqual("java", "java Programming");
		
		
		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);
	
		
	}

}
/**
 1. Write a method that takes two String parameter and checks if the two strings are equal
or not. If they are equal return true, otherwise return false
Access Modifier: Default
Non-Access Modifier: static
Return Type: boolean
Method Name: isEqual
Parameter1: String strOne
Parameter2: String strTwo
 
*/