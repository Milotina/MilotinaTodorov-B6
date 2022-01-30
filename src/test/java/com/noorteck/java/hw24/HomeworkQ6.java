package com.noorteck.java.hw24;

public class HomeworkQ6 {

	protected static boolean checkNum(int[] number) {

		boolean result = false;

		int fiveCount = 0; 
		int twoCount = 0; 

		for (int i = 0; i < number.length; i++) {
			
			if (number[i] == 2) {
				twoCount++;
				
			} else if (number[i] == 5) {
				fiveCount++;
			}
		}

		if (twoCount == 2 || fiveCount == 2) {
			result = true;
		}
		return result;

	}

	public static void main(String[] args) {

		int[] array1 = { 6, 1, 2, 3 };
		int[] array2 = { 13, 2, 3, 4, 6, 1, 2, 3 };
		int[] array3 = { 3, 3, 0, 1, 4, 3, 6 };
		int[] array4 = { 2, 6, 2 };

		boolean getResult1 = checkNum(array1);
		boolean getResult2 = checkNum(array2);
		boolean getResult3 = checkNum(array3);
		boolean getResult4 = checkNum(array4);

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);
	}

}
/**
6. Write a method that takes an array of int parameter and return true if the array
contains value 2 twice, or value 5 twice.

Access Modifier: protected
Non-Access Modifier: static
Return Type: boolean
Method Name: checkNum
Parameter1: int [] number 

*/