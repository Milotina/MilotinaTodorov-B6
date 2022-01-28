package com.noorteck.java.hw24;

public class HomeworkQ7 {

	public static int getIndexNumber(int[] number, int elementValue) {

		int result = 0;

		for (int i = 0; i < number.length; i++) {
		
			if (elementValue == number[i]) {
				result = i;
				break;
			} else {
				result = -1;
			}

		}

		return result;
	}

	public static void main(String[] args) {

		int[] array1 = { 88, 22, 6, 1, 2, 3, 88, 22, 44, 33 };
		int[] array2 = { 1, 2, 3, 22, 44, 33 };
		int[] array3 = { 88, 22, 6, 1, 8, 0 };
		int[] array4 = { 2, 3, 88, 22, 44 };

		int getResult1 = getIndexNumber(array1, 3);
		int getResult2 = getIndexNumber(array2, 12);
		int getResult3 = getIndexNumber(array3, 22);
		int getResult4 = getIndexNumber(array4, 44);

		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);

	}

}
/**
 7. Write a method that takes 2 parameters. An array of int parameter and integer
parameter. Find the index number of an array element. Check if an array has the
element value passed as 2nd parameter. If it contains return the index number of that
element otherwise return -1.

Access Modifier: public
Non-Access Modifier: static
Return Type: int
Method Name: getIndexNumber
Parameter1: int [] number
Parameter1: int elementValue
 
*/