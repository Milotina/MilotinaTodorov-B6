package com.noorteck.java.hw8;

public class QuestionThree {
	public static void main(String[] args) {

		// FOR LOOP
		int i = 21;
		int average = 0;

		for (i = 21; i <= 29; i++) {
			average = average + i;
		}
		System.out.println("Average of numbers between 20-30 is " + average / 9);
		System.out.println("**************************************");

		// WHILE LOOP
		int x = 21;
		int average2 = 0;

		while (x <= 29) {
			average2 = average2 + x;
			x++;
		}
		System.out.println("Average of numbers between 20-30 is " + average2 / 9);
		System.out.println("**************************************");

		// DO WHILE LOOP
		int y = 21;
		int average3 = 0;

		do {
			average3 = average3 + y;
			y++;
		} while (y <= 29);
		System.out.println("Average of numbers between 20-30 is " + average3 / 9);
	}
}
