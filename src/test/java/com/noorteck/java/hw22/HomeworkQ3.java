package com.noorteck.java.hw22;

public class HomeworkQ3 {

	protected String threeEqual(String str, char oldChar, char newChar) {

		String result = "";

		if (str != null && (str.indexOf(oldChar) != -1)) {
			result = str.replace(oldChar, newChar);
		} else {
			result = "null";
		}

		return result;

	}

	public static void main(String[] args) {

		HomeworkQ3 obj = new HomeworkQ3();

		String getResult1 = obj.threeEqual(null, 'P', 'B');
		String getResult2 = obj.threeEqual("Java Pro", 'P', 'B');
		String getResult3 = obj.threeEqual("Lazy mode", 'm', 'C');
		String getResult4 = obj.threeEqual("Training", 'T', ' ');

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);

	}

}
/**
 3. Write a method that takes three parameters. One String parameter, 2 character
parameters. The method replaces old character (parameter 2) from String parameter
with new character (parameter 3) and returns the new string

Access Modifier: protected
Non-Access Modifier: non-static
Return Type: String
Method Name: threeEqual
Parameter1: String str
Parameter2: char oldChar
Parameter3: char newChar
 
*/