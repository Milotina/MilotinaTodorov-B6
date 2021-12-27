package com.noorteck.java.hw8;

public class CozaLozaWoza {

	public static void main(String[] args) {

		// FOR LOOP
		for (int i = 1; i <= 36; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("CozaLoza");
			} else if (i % 3 == 0) {
				System.out.println("Coza");
			} else if (i % 5 == 0) {
				System.out.println("Loza");
			} else if (i % 7 == 0) {
				System.out.println("Woza");
			} else {
				System.out.println(i);
			}

		}

		System.out.println("******************************************");

		// WHILE LOOP
		int x = 1;

		while (x <= 36) {

			if (x % 3 == 0 && x % 5 == 0) {
				System.out.println("CozaLoza");
			} else if (x % 3 == 0) {
				System.out.println("Coza");
			} else if (x % 5 == 0) {
				System.out.println("Loza");
			} else if (x % 7 == 0) {
				System.out.println("Woza");
			} else {
				System.out.println(x);
			}
			x++;
		}
	}

}
