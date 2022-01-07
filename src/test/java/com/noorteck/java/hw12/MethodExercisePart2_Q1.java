package com.noorteck.java.hw12;

public class MethodExercisePart2_Q1 {

	public static void main(String[] args) {

		boolean getResult = posNeg(1, -1, false);
		boolean getResult2 = posNeg(-1, 1, false);
		boolean getResult3 = posNeg(-4, -5, true);

		System.out.println(getResult);
		System.out.println(getResult2);
		System.out.println(getResult3);

	}

	public static boolean posNeg(int n1, int n2, boolean negNum) {

		boolean result = false;

		if (((n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0)) && negNum == false) {
			result = true;

		} else if (negNum == true && n1 < 0 && n2 < 0) {
			result = true;
		}

		return result;
	}

}

/**Given 2 int values and 1 boolean value, return true if one is negative and one is positive and
boolean value is false. Except if the boolean parameter is true, then return true only if both
are negative.

posNeg (1, -1, false) --> true
posNeg (-1, 1, false) --> true
posNeg (-4, -5, true) --> true
*/