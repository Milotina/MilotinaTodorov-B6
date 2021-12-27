package com.noorteck.java.hw8;

public class QuestionFour {

	public static void main(String[] args) {

		// FOR LOOP
		int i = 1;
		int evenSum = 0;
		int oddSum = 0;

		for (i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("Sum of odd numbers is: " + oddSum);
		System.out.println("Sum of even numbers is: " + evenSum);

		System.out.println("****************************************");

		// WHILE LOOP
		int x = 1;
		int evenSum2 = 0;
		int oddSum2 = 0;

		while (x <= 20) {
			if (x % 2 == 0) {
				evenSum2 = evenSum2 + x;
			} else {
				oddSum2 = oddSum2 + x;
			}
			x++;
		}
		System.out.println("Sum of odd numbers is: " + oddSum2);
		System.out.println("Sum of even numbers is: " + evenSum2);

		System.out.println("****************************************");

		// DO WHILE LOOP
		int y = 1;
		int evenSum3 = 0;
		int oddSum3 = 0;

		do {
			if (y % 2 == 0) {
				evenSum3 = evenSum3 + y;
			} else {
				oddSum3 = oddSum3 + y;
			}
			y++;
		} while (y <= 20);
		System.out.println("Sum of odd numbers is: " + oddSum3);
		System.out.println("Sum of even numbers is: " + evenSum3);
	}

}
