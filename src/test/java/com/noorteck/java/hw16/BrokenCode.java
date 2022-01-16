package com.noorteck.java.hw16;

public class BrokenCode {

	public static void main(String[] args) { // correct main method->should be main

		//we should pass only 2 values here of int type, not double
		int addResult = addTwoNumbers(2, 4);

		System.out.println(addResult);

		//single equal, semicolon after boolean condition, boolean expression not correct, one parenthesis, no semicolon
		for (int i = 0; i <= 10; i++) {
			System.out.println("Count" + i); //dot instead of underscore, cannot assign value here, missing +
		}

		whoseFavNumber(2); //should pass only one value
		whoseFavNumber(3); //missing semicolon, should pass only one value
		whoseFavNumber(1); //no need of ,

		myName("John Cena");
	}

	public static void myName(String name) {
		System.out.println("My name is " + name);
	}

	//change place static void, parameters divided by comma, no need of semicolon
	public static int addTwoNumbers(int numOne, int numTwo) {

		int result = numOne + numTwo;

		System.out.println(numOne + " + " + numTwo + " = " + result);

		//return result;
		return result;
	}

	//should not assign value here, only declare variable, no need of second parenthesis
	public static String whoseFavNumber(int i) {

		//data type should be same as return type of the method and default value is ""
		String result = "";

		if (i == 1) { //no need of semicolon, should be double ==
			result = "Brook"; //missing "" and semicolon
		} else if (i >= 2 || i <= 4 && i >= 4) { //missing } and should be double ==
			result = "Dannia"; //result lower case and should be semicolon
		} else if (i == 3) { //else is misspelled, missing double == , and missing {
			result = "Helen";
		} else { //should be {
			result = "my favorite number"; //should be "", semicolon outside ""
		}
		return result; //was missing return result
	}

}
