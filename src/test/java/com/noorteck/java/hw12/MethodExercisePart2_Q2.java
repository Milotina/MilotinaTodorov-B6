package com.noorteck.java.hw12;

public class MethodExercisePart2_Q2 {

	public static void main(String[] args) {

		boolean getResult = multipleOf(3);
		boolean getResult2 = multipleOf(10);
		boolean getResult3 = multipleOf(8);

		System.out.println(getResult);
		System.out.println(getResult2);
		System.out.println(getResult3);

	}

	public static boolean multipleOf(int num) {
		boolean result = false;

		if (num % 3 == 0 || num % 5 == 0) {
			result = true;
		}
		return result;
	}

}
/**Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the %
"mod" operator

multipleOf (3)  --> true
multipleOf (10) --> true
multipleOf (8)  --> false
*/