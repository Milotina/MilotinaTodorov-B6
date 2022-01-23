package com.noorteck.java.hw22;

public class HomeworkQ6 {

	public boolean endsWithNG(String strOne) {

		boolean result = false;

		if (strOne == null) {
			result = false;
		} else if (strOne.endsWith("ng")) {
			result = true;
		}

		return result;

	}

	public static void main(String[] args) {

		HomeworkQ6 obj = new HomeworkQ6();

		boolean getResult1 = obj.endsWithNG(null);
		boolean getResult2 = obj.endsWithNG("I like to practice");
		boolean getResult3 = obj.endsWithNG("Everyone is practicing");
		boolean getResult4 = obj.endsWithNG("I am studying");

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);
	}

}
/**
 6. Write a method that takes a string parameter and return true if the string parameter
ends in "ng"

Access Modifier: public
Non-Access Modifier: non-static
Return Type: boolean
Method Name: endsWithNG
Parameter1: String strOne
 
*/