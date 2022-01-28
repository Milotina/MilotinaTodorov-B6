package com.noorteck.java.hw24;

public class HomeworkQ5 {

	private int[] getDouble(int[] number) {

		int newArrayLength = number.length * 2;
		int[] result = new int[newArrayLength];
		result[newArrayLength - 1] = number[number.length - 1];
		return result;

	}

	public static void main(String[] args) {

		HomeworkQ5 obj = new HomeworkQ5();

		int[] array1 = { 6, 1, 2, 3 };
		int[] array2 = { 13, 3 };
		int[] array3 = { 0, 1, 4 };
		int[] array4 = { 6 };

		int[] getResult1 = obj.getDouble(array1);
		for (int a = 0; a < getResult1.length; a++) {
			System.out.println(getResult1[a]);
		}
		System.out.println("*******");

		int[] getResult2 = obj.getDouble(array2);
		for (int b = 0; b < getResult2.length; b++) {
			System.out.println(getResult2[b]);
		}
		System.out.println("*******");

		int[] getResult3 = obj.getDouble(array3);
		for (int c = 0; c < getResult3.length; c++) {
			System.out.println(getResult3[c]);
		}
		System.out.println("*******");

		int[] getResult4 = obj.getDouble(array4);
		for (int d = 0; d < getResult4.length; d++) {
			System.out.println(getResult4[d]);
		}

	}

}
/**
 5. Write a method that takes an array of int parameter and return a new array with double
the size/length, where its last element value is the same as the original array last
element, and all the other element values are 0.

Access Modifier: private
Non-Access Modifier: non-static
Return Type: int []
Method Name: getDouble
Parameter1: int [] number
 */
