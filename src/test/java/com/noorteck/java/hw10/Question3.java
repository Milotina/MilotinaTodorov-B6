package com.noorteck.java.hw10;

public class Question3 {

	public static void main(String[] args) {
		oddEven(13);
	}

	public static void oddEven(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is an even number");
		} else {
			System.out.println(number + " is an odd number");
		}
	}

}
