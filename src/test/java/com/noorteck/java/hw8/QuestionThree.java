package com.noorteck.java.hw8;

public class QuestionThree {
	public static void main(String[] args) {

		// FOR LOOP
		int i = 20;
		int sum = 0;

		for (i = 20; i <= 30; i++) {
			sum = sum + i;
		}
		System.out.println("Average of numbers between 20-30 is " + sum / 11);
		System.out.println("**************************************");

		// WHILE LOOP
		int x = 20;
		int sum2 = 0;

		while (x <= 30) {
			sum2 = sum2 + x;
			x++;
		}
		System.out.println("Average of numbers between 20-30 is " + sum2 / 11);
		System.out.println("**************************************");

		// DO WHILE LOOP
		int y = 20;
		int sum3 = 0;

		do {
			sum3 = sum3 + y;
			y++;
		} while (y <= 30);
		System.out.println("Average of numbers between 20-30 is " + sum3 / 11);
	}
}
