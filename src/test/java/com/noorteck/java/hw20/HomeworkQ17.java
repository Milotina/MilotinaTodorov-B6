package com.noorteck.java.hw20;

public class HomeworkQ17 {

	public boolean endsWithNG(String strOne) {

		boolean result = false;

		if (strOne.endsWith("ng")) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {

		HomeworkQ17 obj = new HomeworkQ17();

		boolean getResult1 = obj.endsWithNG("I like to practice");
		boolean getResult2 = obj.endsWithNG("Everyone is practicing");
		boolean getResult3 = obj.endsWithNG("I am studying");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);

	}

}
/**
17. Write a method that takes a string parameter and return true if the string parameter
ends in "ng"

Access Modifier: public
Non-Access Modifier: non-static
Return Type: boolean
Method Name: endsWithNG
Parameter1: String strOne
*/