package com.noorteck.java.hw12;

public class MethodExercisePart4_Q3 {

	public static void main(String[] args) {

		String getResult = checkNum(12);
		String getResult2 = checkNum(-2);
		String getResult3 = checkNum(0);

		System.out.println(getResult);
		System.out.println(getResult2);
		System.out.println(getResult3);

	}

	public static String checkNum(int num) {

		String result = "";

		if (num == 0) {
			result = num + " is zero";
		} else if (num < 0) {
			result = num + " is negative";
		} else {
			result = num + " is positive";
		}

		return result;

	}

}

/**Given 1 int value, return if the number is positive, negative or zero.
Method Return Type: String

checkNum(12) --- > positive
checkNum(-2) -----> negative
checkNum(0) ---- > zero
 */