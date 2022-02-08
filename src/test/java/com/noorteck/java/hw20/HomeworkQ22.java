package com.noorteck.java.hw20;

public class HomeworkQ22 {

	public static int occurenceCount(String str, char c) {

		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				result++;
		}

		return result;

	}

	public static void main(String[] args) {

		int getResult1 = occurenceCount("java training", 'a');
		int getResult2 = occurenceCount("java training", 'i');
		int getResult3 = occurenceCount("I love programming", 'm');
		int getResult4 = occurenceCount("Sunday", 'f');

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);

	}

}
/**
22. Write a method that takes two parameters, String and char. Count the occurrence of a
given character in a string and return the value of how many times a character occurred
in a string

Access Modifier: public
Non-Access Modifier: static
Return Type: int
Method Name: occurenceCount
Parameter1: String str
Parameter2: char c
*/