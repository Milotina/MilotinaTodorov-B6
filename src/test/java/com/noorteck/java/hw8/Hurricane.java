package com.noorteck.java.hw8;

public class Hurricane {

	public static void main(String[] args) {

		// FOR LOOP
		for (int speed = 20; speed <= 200; speed++) {

			if (speed >= 74 && speed <= 95) {
				System.out.println("Hurricane Category 1 --> Wind Speed: 74-95");
			} else if (speed >= 105 && speed <= 110) {
				System.out.println("Hurricane Category 2 --> Wind Speed: 105-110");
			} else if (speed >= 120 && speed <= 130) {
				System.out.println("Hurricane Category 3 --> Wind Speed: 120-130");
			} else if (speed >= 140 && speed <= 155) {
				System.out.println("Hurricane Category 4 --> Wind Speed: 140-155");
			} else if (speed >= 165 && speed <= 194) {
				System.out.println("Hurricane Category 5 --> Wind Speed: 165-194");
			}
		}

		System.out.println("**************************************************");

		// WHILE LOOP
		int speed2 = 20;

		while (speed2 <= 200) {

			if (speed2 >= 74 && speed2 <= 95) {
				System.out.println("Hurricane Category 1 --> Wind Speed: 74-95");
			} else if (speed2 >= 105 && speed2 <= 110) {
				System.out.println("Hurricane Category 2 --> Wind Speed: 105-110");
			} else if (speed2 >= 120 && speed2 <= 130) {
				System.out.println("Hurricane Category 3 --> Wind Speed: 120-130");
			} else if (speed2 >= 140 && speed2 <= 155) {
				System.out.println("Hurricane Category 4 --> Wind Speed: 140-155");
			} else if (speed2 >= 165 && speed2 <= 194) {
				System.out.println("Hurricane Category 5 --> Wind Speed: 165-194");
			}
			speed2++;
		}
	}

}
