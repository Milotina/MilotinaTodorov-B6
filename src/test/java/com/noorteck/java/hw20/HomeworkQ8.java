package com.noorteck.java.hw20;

public class HomeworkQ8 {

	public static char getCharacter(String strOne, int indexNum) {

		char result = ' ';

		if (indexNum < strOne.length()) {
			result = strOne.charAt(indexNum);
		} else if (indexNum >= strOne.length()) {
			result = '?';
		}

		return result;
	}

	public static void main(String[] args) {

		char getResult1 = getCharacter("java training", 2);
		char getResult2 = getCharacter("java training", 5);
		char getResult3 = getCharacter("java training", 8);
		char getResult4 = getCharacter("java training", 22);

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);

	}

}
/**	
 8. Write a method that takes two parameters, one String parameter and one integer
parameter. The method should return the character at the given index within the String.
If the indexNum more than the length of String then return ‘?’ mark
Access Modifier: public
Non-Access Modifier: static
Return Type: char
Method Name: getCharacter
Parameter1: String strOne
Parameter2: Int indexNum
 
*/