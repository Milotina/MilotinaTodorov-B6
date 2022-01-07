package com.noorteck.java.hw12;

public class MethodExercisePart4_Q4 {

	public static void main(String[] args) {

		int getResult = sumOf(15);
		System.out.println(getResult);

		int getResult1 = sumOf(10);
		System.out.println(getResult1);

		int getResult2 = sumOf(3);
		System.out.println(getResult2);

		int getResult3 = sumOf(5);
		System.out.println(getResult3);

		int getResult4 = sumOf(8);
		System.out.println(getResult4);

	}

	public static int sumOf(int numValue) {
		int result = 0;

		for (int i = 1; i <= numValue; i++) {

			if (i % 3 == 0 || i % 5 == 0)
				result = result + i;
		}

		return result;
	}

}

/**
 Given an integer numValue, write a method that returns 
 sums all multiples of 3 and 5 up to numValue number.
Method Name: sumOf
Return Type: Integer
Parameter1: int numValue
Example:
sumOf (15) ------- > 60
sumOf (10) ------- > 33
sumOf (3) ------- > 3
sumOf (5) ------- > 8
sumOf (8) ------- > 14
*/






